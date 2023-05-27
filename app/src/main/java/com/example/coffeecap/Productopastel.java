package com.example.coffeecap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Productopastel extends AppCompatActivity {

    public ImageButton btnRegreso4;
    public ImageButton btnHome4;
    public Button btnSeguir2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productopastel);

        btnRegreso4 = findViewById(R.id.btnRegreso4);
        btnHome4 = findViewById(R.id.btnHome4);
        btnSeguir2 = findViewById(R.id.btnSeguir2);

        btnRegreso4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Productopastel.this, MenuCasino.class);
                startActivity(intent);
            }
        });

        btnHome4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Productopastel.this, MenuCasino.class);
                startActivity(intent);

            }
        });

        btnSeguir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Productopastel.this, Menupastel.class);
                startActivity(intent);
            }
        });


    }
}