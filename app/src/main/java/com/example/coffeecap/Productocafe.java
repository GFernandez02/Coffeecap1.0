package com.example.coffeecap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Productocafe extends AppCompatActivity {

    public ImageButton btnRegreso;
    public ImageButton btnHome;
    public Button btnSeguir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productocafe);

        btnRegreso = findViewById(R.id.btnRegreso);
        btnHome = findViewById(R.id.btnHome);
        btnSeguir = findViewById(R.id.btnSeguir);

        btnRegreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Productocafe.this, MenuCasino.class);
                startActivity(intent);

            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Productocafe.this, MenuCasino.class);
                startActivity(intent);

            }
        });

        btnSeguir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Productocafe.this, Menucafes.class);
                startActivity(intent);
            }
        });

    }


}