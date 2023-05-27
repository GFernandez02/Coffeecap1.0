package com.example.coffeecap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuCasino extends AppCompatActivity {

    public Button btnCafe;
    public Button btnHamburguesa;
    public Button btnPastel;
    public Button btnEnsalada;
    public Button btnSnack;

    public Button btnCerrarsesion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_casino);

        btnCafe = findViewById(R.id.btnCafe);
        btnHamburguesa = findViewById(R.id.btnHamburguesa);
        btnPastel = findViewById(R.id.btnPastel);
        btnEnsalada = findViewById(R.id.btnEnsalada);
        btnSnack = findViewById(R.id.btnSnack);
        btnCerrarsesion = findViewById(R.id.btnCerrarsesion);

    btnCafe.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(MenuCasino.this, Productocafe.class);
            startActivity(intent);
        }
    });

            btnHamburguesa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(MenuCasino.this, Productohamburguesa.class);
                    startActivity(intent);

                }
            });

            btnPastel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(MenuCasino.this, Productopastel.class);
                    startActivity(intent);
                }
            });

            btnEnsalada.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(MenuCasino.this, Productoensalada.class);
                    startActivity(intent);

                }
            });

            btnSnack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(MenuCasino.this, Productosnacks.class);
                    startActivity(intent);

                }
            });

        btnCerrarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent intent = new Intent(MenuCasino.this, MainActivity.class);
            startActivity(intent);

            }
        });

    }
}
