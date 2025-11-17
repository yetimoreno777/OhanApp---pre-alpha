package com.sistemasardillisados.ohanaapp;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
import com.sistemasardillisados.ohanaapp.tablas.SupabaseApi;
import com.sistemasardillisados.ohanaapp.utils.Animaciones;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class LoginCnt extends AppCompatActivity {
    //★Inicio
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_cnt);
        /*
        Retrofit Retro = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        SupabaseApi Api = Retro.create(SupabaseApi.class);

        */
        //■Eventos■■■■■■■■■■■■■■■■■■■■■■
        //★Botton 3
        {
            MaterialButton Btn0 = findViewById(R.id.button2);
            Btn0.setOnClickListener(v->{
                Animaciones.AnimationBtn(Btn0);
                EditText Nombre = findViewById(R.id.editTextTextEmailAddress);
                //Nombre.getText();
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