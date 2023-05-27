package com.example.coffeecap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menupastel extends AppCompatActivity {

    public ImageButton btnRegresar4;
    public ImageButton btnHome7;
    public Button btnEnviar8;
    public Button btnCarrito8;
    public Button btnContinuarpago8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menupastel);

        btnRegresar4 = findViewById(R.id.btnRegresar4);
        btnHome7 = findViewById(R.id.btnHome7);
        btnEnviar8 = findViewById(R.id.btnEnviar8);
        btnCarrito8 = findViewById(R.id.btnCarrito8);
        btnContinuarpago8 = findViewById(R.id.btnContinuarpago8);

        btnRegresar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menupastel.this, Productopastel.class);
                startActivity(intent);


            }
        });

        btnHome7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menupastel.this, MenuCasino.class);
                startActivity(intent);

            }
        });

        btnEnviar8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menupastel.this, Ayuda.class);
                startActivity(intent);


            }
        });

        btnCarrito8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menupastel.this, Carrito.class);
                startActivity(intent);


            }
        });

        btnContinuarpago8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menupastel.this, Formapagos.class);
                startActivity(intent);


            }
        });

    }
}