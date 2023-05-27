package com.example.coffeecap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menuensalada extends AppCompatActivity {

    public ImageButton btnRegresar4;
    public ImageButton btnHome7;
    public Button btnEnviar3;
    public Button btnCarrito3;
    public Button btnContinuarpago3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuensalada);

        btnRegresar4 = findViewById(R.id.btnRegresar4);
        btnHome7 = findViewById(R.id.btnHome7);
        btnEnviar3 = findViewById(R.id.btnEnviar3);
        btnCarrito3 = findViewById(R.id.btnCarrito3);
        btnContinuarpago3 = findViewById(R.id.btnContinuarpago3);

        btnRegresar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menuensalada.this, Productoensalada.class);
                startActivity(intent);

            }
        });

        btnHome7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menuensalada.this, MenuCasino.class);
                startActivity(intent);
            }
        });

        btnEnviar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menuensalada.this, Ayuda.class);
                startActivity(intent);

            }
        });

        btnCarrito3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menuensalada.this, Carrito.class);
                startActivity(intent);

            }
        });

        btnContinuarpago3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menuensalada.this, Formapagos.class);
                startActivity(intent);

            }
        });

    }
}