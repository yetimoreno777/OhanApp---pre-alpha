package com.sistemasardillisados.ohanaapp;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
import com.sistemasardillisados.ohanaapp.utils.Animaciones;

public class RegistroAct extends AppCompatActivity{
    //★Inicio
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro);
        //Boton Registro
        {
            MaterialButton Btn1 = findViewById(R.id.button_register);
            Btn1.setOnClickListener(v->{
                Animaciones.AnimationBtn(Btn1);
            });
        }
        //★Botton Cerrar
        {
            MaterialButton Btn0 = findViewById(R.id.button_close);
            Btn0.setOnClickListener(v->{
                Intent intent = new Intent(RegistroAct.this, LoginAct.class);
                startActivity(intent);finish();
            });
        }
    }
}