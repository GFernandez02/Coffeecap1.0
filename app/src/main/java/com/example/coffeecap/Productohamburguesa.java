package com.example.coffeecap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Productohamburguesa extends AppCompatActivity {

    public ImageButton btnRegreso6;
    public ImageButton btnHome6;
    public Button btnSeguir5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productohamburguesa);

        btnRegreso6 = findViewById(R.id.btnRegreso6);
        btnHome6 = findViewById(R.id.btnHome6);
        btnSeguir5 = findViewById(R.id.btnSeguir5);

        btnRegreso6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Productohamburguesa.this, MenuCasino.class);
                startActivity(intent);
            }
        });

        btnHome6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Productohamburguesa.this, MenuCasino.class);
                startActivity(intent);

            }
        });

        btnSeguir5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Productohamburguesa.this, Menuhamburguesa.class);
                startActivity(intent);

            }
        });


    }
}