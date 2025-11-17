package com.sistemasardillisados.ohanaapp.utils;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Tga {
    public static class ImageData {
        public int width;
        public int height;
        public byte[] pixelsRGBA;
        public ImageData(int width, int height, byte[] pixelsRGBA) {
            this.width = width;
            this.height = height;
            this.pixelsRGBA = pixelsRGBA;
        }
    }
    private ImageData imgData;
    public Tga(InputStream inputStream) throws IOException {
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(inputStream))) {
            byte[] header = new byte[18];
            dis.readFully(header);
            int width = ((header[13] & 0xFF) << 8) | (header[12] & 0xFF);
            int height = ((header[15] & 0xFF) << 8) | (header[14] & 0xFF);
            int bitsPerPixel = header[16] & 0xFF;
            boolean hasAlpha = (bitsPerPixel == 32);
            int bytesPerPixel = bitsPerPixel / 8;
            if (bitsPerPixel != 24 && bitsPerPixel != 32) {
                throw new IllegalArgumentException("TGA debe ser 24 o 32 bits");
            }
            boolean isCompressed = (header[2] & 0xFF) == 10;
            byte[] imgDataRaw = new byte[width * height * bytesPerPixel];
            if (!isCompressed) {
                dis.readFully(imgDataRaw);
            } else {
                int pixelCount = width * height;
                int currentPixel = 0;
                int currentByte = 0;
                while (currentPixel < pixelCount) {
                    int chunkHeader = dis.readUnsignedByte();
                    if (chunkHeader < 128) {
                        chunkHeader++;
                        for (int i = 0; i < chunkHeader; i++, currentPixel++) {
                            byte[] pixel = new byte[bytesPerPixel];
                            dis.readFully(pixel);
                            System.arraycopy(pixel, 0, imgDataRaw, currentByte, bytesPerPixel);
                            currentByte += bytesPerPixel;
                        }
                    } else {
                        chunkHeader -= 127;
                        byte[] pixel = new byte[bytesPerPixel];
                        dis.readFully(pixel);
                        for (int i = 0; i < chunkHeader; i++, currentPixel++) {
                            System.arraycopy(pixel, 0, imgDataRaw, currentByte, bytesPerPixel);
                            currentByte += bytesPerPixel;
                        }
                    }
                }
            }
            int descriptor = header[17] & 0xFF;
            boolean topDown = (descriptor & 0x20) != 0;
            boolean leftToRight = (descriptor & 0x10) == 0;
            byte[] pixelsRGBA = new byte[width * height * 4];
            for (int y = 0; y < height; y++) {
                int sourceY = topDown ? y : (height - 1 - y);
                for (int x = 0; x < width; x++) {
                    int sourceX = leftToRight ? x : (width - 1 - x);
                    int idxIn = (sourceY * width + sourceX) * bytesPerPixel;
                    int idxOut = (y * width + x) * 4;
                    pixelsRGBA[idxOut + 0] = imgDataRaw[idxIn + 2];
                    pixelsRGBA[idxOut + 1] = imgDataRaw[idxIn + 1];
                    pixelsRGBA[idxOut + 2] = imgDataRaw[idxIn + 0];
                    pixelsRGBA[idxOut + 3] = hasAlpha ? imgDataRaw[idxIn + 3] : (byte) 255;
                }
            }
            imgData = new ImageData(width, height, pixelsRGBA);
        }
    }
    public ImageData getImageData() {
        return imgData;
    }
}
