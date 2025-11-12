package com.sistemasardillisados.ohanaapp;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
public class Load extends AppCompatActivity {
    //★Inicio
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_load);
        //■Calculos■■■■■■■■■■■■■■■■■■■■■
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(Load.this, LoginAct.class);
            startActivity(intent); finish();
        }, 1000);
    }
}