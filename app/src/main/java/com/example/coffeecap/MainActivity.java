package com.example.coffeecap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import android.text.method.PasswordTransformationMethod;




public class MainActivity extends AppCompatActivity {



    public EditText txtIngCorreo;
    public EditText txtIngPass;
    public Button btnIniciarSesion;
    public Button btnAyuda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtIngCorreo = findViewById(R.id.txtIngCorreo);
        txtIngPass = findViewById(R.id.txtIngPass);
        txtIngPass.setTransformationMethod(new PasswordTransformationMethod());
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
        btnAyuda = findViewById(R.id.btnAyuda);


        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String correo = txtIngCorreo.getText().toString();
                String contrasena = txtIngPass.getText().toString();


                if (correo.equals("a@test.cl") && contrasena.equals("test123")) {
                    //Ingreso realizado exitosamente, bienvenido

                    Intent intent = new Intent(MainActivity.this, MenuCasino.class);
                    startActivity(intent);

                } else {
                    //Por favor, ingrese las credenciales correctamente

                    Toast.makeText(MainActivity.this, "Error, por favor ingrese credenciales nuevamente", Toast.LENGTH_SHORT).show();
                }

            }
            });
//TODO ESTO ES EL NUCLEO DE LOS ONCLICKs
                btnAyuda.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(MainActivity.this, Ayuda.class);
                        startActivity(intent);

                    }
                });

    }

    // Clase estática para el filtro de contraseña
}
