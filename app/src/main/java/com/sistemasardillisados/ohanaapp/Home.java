package com.sistemasardillisados.ohanaapp;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.sistemasardillisados.ohanaapp.utils.Tga;
public class Home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        //■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

        //■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
        try {
            ImageView imageView = findViewById(R.id.ImgNews000);
            {
                AssetManager assetManager = getAssets();
                InputStream inputStream = assetManager.open("Art/Te-Ohana-_2_.tga");
                Tga tga = new Tga(inputStream); Tga.ImageData data = tga.getImageData();
                Bitmap bitmap = Bitmap.createBitmap(data.width, data.height, Bitmap.Config.ARGB_8888);
                bitmap.copyPixelsFromBuffer(ByteBuffer.wrap(data.pixelsRGBA));
                imageView.setImageBitmap(bitmap);inputStream.close();
            }
            imageView = findViewById(R.id.ImgNews001);
            {
                AssetManager assetManager = getAssets();
                InputStream inputStream = assetManager.open("Art/Limonada-Ohana.tga");
                Tga tga = new Tga(inputStream);Tga.ImageData data = tga.getImageData();
                Bitmap bitmap = Bitmap.createBitmap(data.width, data.height, Bitmap.Config.ARGB_8888);
                bitmap.copyPixelsFromBuffer(ByteBuffer.wrap(data.pixelsRGBA));
                imageView.setImageBitmap(bitmap);inputStream.close();
            }
            imageView = findViewById(R.id.ImgNews002);
            {
                AssetManager assetManager = getAssets();
                InputStream inputStream = assetManager.open("Art/Jamaica-Ohana.tga");
                Tga tga = new Tga(inputStream);Tga.ImageData data = tga.getImageData();
                Bitmap bitmap = Bitmap.createBitmap(data.width, data.height, Bitmap.Config.ARGB_8888);
                bitmap.copyPixelsFromBuffer(ByteBuffer.wrap(data.pixelsRGBA));
                imageView.setImageBitmap(bitmap);inputStream.close();
            }
            imageView = findViewById(R.id.ImgNews003);
            {
                AssetManager assetManager = getAssets();
                InputStream inputStream = assetManager.open("Art/Horchata-Ohana.tga");
                Tga tga = new Tga(inputStream); Tga.ImageData data = tga.getImageData();
                Bitmap bitmap = Bitmap.createBitmap(data.width, data.height, Bitmap.Config.ARGB_8888);
                bitmap.copyPixelsFromBuffer(ByteBuffer.wrap(data.pixelsRGBA));
                imageView.setImageBitmap(bitmap);inputStream.close();
            }
            imageView = findViewById(R.id.ImgNews004);
            {
                AssetManager assetManager = getAssets();
                InputStream inputStream = assetManager.open("Art/DummyNews.tga");
                Tga tga = new Tga(inputStream); Tga.ImageData data = tga.getImageData();
                Bitmap bitmap = Bitmap.createBitmap(data.width, data.height, Bitmap.Config.ARGB_8888);
                bitmap.copyPixelsFromBuffer(ByteBuffer.wrap(data.pixelsRGBA));
                imageView.setImageBitmap(bitmap);inputStream.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}