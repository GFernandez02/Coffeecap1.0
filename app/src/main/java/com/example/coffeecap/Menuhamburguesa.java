package com.example.coffeecap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menuhamburguesa extends AppCompatActivity {

    public ImageButton btnRegresar;
    public ImageButton btnHome3;
    public Button btnEnviar2;
    public Button btnCarrito2;
    public Button btnContinuarpago2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuhamburguesa);

        btnRegresar = findViewById(R.id.btnRegresar);
        btnHome3 = findViewById(R.id.btnHome3);
        btnEnviar2 = findViewById(R.id.btnEnviar2);
        btnCarrito2 = findViewById(R.id.btnCarrito2);
        btnContinuarpago2 = findViewById(R.id.btnContinuarpago2);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menuhamburguesa.this, Productohamburguesa.class);
                startActivity(intent);

            }
        });
        btnHome3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menuhamburguesa.this, MenuCasino.class);
                startActivity(intent);

            }
        });
        btnEnviar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menuhamburguesa.this, Ayuda.class);
                startActivity(intent);

            }
        });
        btnCarrito2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menuhamburguesa.this, Carrito.class);
                startActivity(intent);

            }
        });
        btnContinuarpago2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menuhamburguesa.this, Formapagos.class);
                startActivity(intent);


            }
        });

    }
}