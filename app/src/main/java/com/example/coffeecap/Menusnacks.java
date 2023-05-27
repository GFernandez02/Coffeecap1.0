package com.example.coffeecap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menusnacks extends AppCompatActivity {

    public ImageButton btnRegresar4;
    public ImageButton btnHome7;
    public Button btnEnviar4;
    public Button btnCarrito4;
    public Button btnContinuarpago4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menusnacks);

        btnRegresar4 = findViewById(R.id.btnRegresar4);
        btnHome7 = findViewById(R.id.btnHome7);
        btnEnviar4 = findViewById(R.id.btnEnviar4);
        btnCarrito4 = findViewById(R.id.btnCarrito4);
        btnContinuarpago4 = findViewById(R.id.btnContinuarpago4);

        btnRegresar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menusnacks.this, Productosnacks.class);
                startActivity(intent);
            }
        });

        btnHome7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menusnacks.this, MenuCasino.class);
                startActivity(intent);

            }
        });

        btnEnviar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menusnacks.this, Ayuda.class);
                startActivity(intent);

            }
        });

        btnCarrito4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menusnacks.this, Carrito.class);
                startActivity(intent);

            }
        });

        btnContinuarpago4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menusnacks.this, Formapagos.class);
                startActivity(intent);

            }
        });

    }
}