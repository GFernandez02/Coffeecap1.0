package com.example.coffeecap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Productoensalada extends AppCompatActivity {

    public ImageButton btnRegreso4;
    public ImageButton btnHome4;
    public Button btnSeguir3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productoensalada);

        btnRegreso4 = findViewById(R.id.btnRegreso4);
        btnHome4 = findViewById(R.id.btnHome4);
        btnSeguir3 = findViewById(R.id.btnSeguir3);

        btnRegreso4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Productoensalada.this, MenuCasino.class);
                startActivity(intent);
            }
        });
        btnHome4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Productoensalada.this, MenuCasino.class);
                startActivity(intent);
            }
        });

        btnSeguir3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Productoensalada.this, Menuensalada.class);
                startActivity(intent);
            }
        });
        
    }
}