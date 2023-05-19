package com.example.coffeecap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuCasino extends AppCompatActivity {

    public Button btnCafe;
    public Button btnCerrarsesion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_casino);

        btnCafe = findViewById(R.id.btnCafe);
        btnCerrarsesion = findViewById(R.id.btnCerrarsesion);

    btnCafe.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(MenuCasino.this, Productocafe.class);
            startActivity(intent);

        btnCerrarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent intent = new Intent(MenuCasino.this, MainActivity.class);
            startActivity(intent);

            }
        });

        }


    });

    }
}
