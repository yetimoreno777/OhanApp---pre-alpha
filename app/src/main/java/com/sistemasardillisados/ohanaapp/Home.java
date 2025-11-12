package com.sistemasardillisados.ohanaapp;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import java.io.IOException;
import java.io.InputStream;
public class Home extends  AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        //Dummy 000
        {
            try {
                ImageView imageView = findViewById(R.id.ImgNews000);
                AssetManager assetManager = getAssets();
                InputStream inputStream = assetManager.open("Art/DummyNews.png");
                Drawable drawable = Drawable.createFromStream(inputStream, null);
                imageView.setImageDrawable(drawable);
                imageView = findViewById(R.id.ImgNews001);imageView.setImageDrawable(drawable);
                imageView = findViewById(R.id.ImgNews002);imageView.setImageDrawable(drawable);
                imageView = findViewById(R.id.ImgNews003);imageView.setImageDrawable(drawable);
                imageView = findViewById(R.id.ImgNews004);imageView.setImageDrawable(drawable);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}