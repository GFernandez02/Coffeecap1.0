package com.example.coffeecap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menucafes extends AppCompatActivity {

    public ImageButton btnRegresar1;
    public ImageButton btnHome1;
    public Button btnCarrito;
    public Button btnEnviar;
    public Button btnContinuarpago;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menucafes);

        btnRegresar1 = findViewById(R.id.btnRegresar1);
        btnHome1 = findViewById(R.id.btnHome1);
        btnCarrito = findViewById(R.id.btnCarrito);
        btnEnviar = findViewById(R.id.btnEnviar);
        btnContinuarpago = findViewById(R.id.btnContinuarpago);

        btnRegresar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menucafes.this, Productocafe.class);
                startActivity(intent);
            }
        });

        btnHome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menucafes.this, MenuCasino.class);
                startActivity(intent);

            }
        });

        btnCarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menucafes.this, Carrito.class);
                startActivity(intent);

            }
        });

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menucafes.this, Ayuda.class);
                startActivity(intent);

            }
        });

        btnContinuarpago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menucafes.this, Formapagos.class);
                startActivity(intent);

            }
        });
    }
}