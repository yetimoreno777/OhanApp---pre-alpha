package com.sistemasardillisados.ohanaapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.lifecycleScope;

import com.google.android.material.button.MaterialButton;
import com.sistemasardillisados.ohanaapp.utils.Animaciones;

// IMPORTANTE:
import com.sistemasardillisados.ohanaapp.Usuario;
import com.sistemasardillisados.ohanaapp.SupabaseAuthKt;

import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.launch;

public class LoginCnt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_cnt);

        // ★ Botón Login (button2)
        {
            MaterialButton Btn0 = findViewById(R.id.button2);
            Btn0.setOnClickListener(v -> {
                Animaciones.AnimationBtn(Btn0);

                EditText txtCorreo = findViewById(R.id.editTextTextEmailAddress);
                EditText txtPass = findViewById(R.id.editTextTextPassword);

                String correo = txtCorreo.getText().toString();
                String pass = txtPass.getText().toString();

                // Llamamos a Supabase
                lifecycleScope.launch(Dispatchers.Main, () -> {
                    Usuario user = SupabaseAuthKt.loginUsuario(correo);

                    if (user == null) {
                        Toast.makeText(LoginCnt.this, "Usuario no encontrado", Toast.LENGTH_SHORT).show();
                        return null;
                    }

                    if (!user.getContraseña().equals(pass)) {
                        Toast.makeText(LoginCnt.this, "Contraseña incorrecta", Toast.LENGTH_SHORT).show();
                        return null;
                    }

                    // LOGIN CORRECTO
                    Toast.makeText(LoginCnt.this, "Bienvenido " + user.getCorreo(), Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(LoginCnt.this, Home.class);
                    startActivity(intent);
                    finish();

                    return null;
                });

            });
        }

        // ★ Botón Cerrar
        {
            MaterialButton Btn0 = findViewById(R.id.button_close);
            Btn0.setOnClickListener(v -> {
                Intent intent = new Intent(LoginCnt.this, LoginAct.class);
                startActivity(intent);
                finish();
            });
        }
    }
}
