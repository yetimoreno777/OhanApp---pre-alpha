package com.sistemasardillisados.ohanaapp;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class PrgTestMenu extends AppCompatActivity {
    //★Inicio
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_prg_test_menu);
        //000A
        {
            Button Botton = findViewById(R.id.button5);
            Botton.setOnClickListener(v->{
                Intent intent = new Intent(PrgTestMenu.this, Load.class);
                startActivity(intent);
            });
        }
        //001A
        {
            Button Botton = findViewById(R.id.button4);
            Botton.setOnClickListener(v->{
                Intent intent = new Intent(PrgTestMenu.this, LoginAct.class);
                startActivity(intent);
            });
        }
        //002A
        {
            Button Botton = findViewById(R.id.button6);
            Botton.setOnClickListener(v->{
                Intent intent = new Intent(PrgTestMenu.this, LoginCnt.class);
                startActivity(intent);
            });
        }
        //003A
        {
            Button Botton = findViewById(R.id.button7);
            Botton.setOnClickListener(v->{
                Intent intent = new Intent(PrgTestMenu.this, Home.class);
                startActivity(intent);
            });
        }
        //004A
        {
            Button Botton = findViewById(R.id.button8);
            Botton.setOnClickListener(v->{
                Intent intent = new Intent(PrgTestMenu.this, RegistroAct.class);
                startActivity(intent);
            });
        }
        //005A
        {
            Button Botton = findViewById(R.id.button9);
            Botton.setOnClickListener(v->{
                Intent intent = new Intent(PrgTestMenu.this, DummyAct.class);
                startActivity(intent);
            });
        }
    }
}