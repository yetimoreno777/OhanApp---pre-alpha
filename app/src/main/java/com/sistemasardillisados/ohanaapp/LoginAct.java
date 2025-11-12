package com.sistemasardillisados.ohanaapp;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
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
                Utils.AnimationBtn(Btn0);
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
                Utils.AnimationBtn(Btn1);
                new Handler().postDelayed(() -> {
                    Intent intent = new Intent(LoginAct.this, PrgTestMenu.class);
                    startActivity(intent);
                }, 50);
            });
        }
    }
}