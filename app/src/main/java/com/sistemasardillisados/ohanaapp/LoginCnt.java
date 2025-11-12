package com.sistemasardillisados.ohanaapp;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
public class LoginCnt extends AppCompatActivity {
    //★Inicio
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_cnt);
        //■Eventos■■■■■■■■■■■■■■■■■■■■■■
        //★Botton 3
        {
            MaterialButton Btn0 = findViewById(R.id.button2);
            Btn0.setOnClickListener(v->{
                Utils.AnimationBtn(Btn0);
            });
        }
        //★Botton Cerrar
        {
            MaterialButton Btn0 = findViewById(R.id.button_close);
            Btn0.setOnClickListener(v->{
                Intent intent = new Intent(LoginCnt.this, LoginAct.class);
                startActivity(intent);finish();
            });
        }
    }
}