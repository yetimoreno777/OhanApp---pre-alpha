package com.sistemasardillisados.ohanaapp;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
import com.sistemasardillisados.ohanaapp.utils.Animaciones;
import androidx.lifecycle.lifecycleScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.launch;
import kotlinx.coroutines.withContext;
import com.sistemasardillisados.ohanaapp.SupabaseAuth;
import com.sistemasardillisados.ohanaapp.Usuario;

public class LoginAct extends AppCompatActivity {
    //★Inicio
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        //■Eventos■■■■■■■■■■■■■■■■■■■■■■
        //★Botton 1
        {
            MaterialButton Btn0 = findViewById(R.id.button);
            Btn0.setOnClickListener(v->{
                Animaciones.AnimationBtn(Btn0);
                new Handler().postDelayed(() -> {
                    Intent intent = new Intent(LoginAct.this, LoginCnt.class);
                    startActivity(intent);
                }, 50);
            });
        }
        //★Botton 2
        {
            MaterialButton Btn1 = findViewById(R.id.button2);
            Btn1.setOnClickListener(v->{
                Animaciones.AnimationBtn(Btn1);
                new Handler().postDelayed(() -> {
                    Intent intent = new Intent(LoginAct.this, PrgTestMenu.class);
                    startActivity(intent);
                }, 50);
            });
        }
    }
}