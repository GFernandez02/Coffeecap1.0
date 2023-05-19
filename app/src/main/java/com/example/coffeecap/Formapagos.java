package com.example.coffeecap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Formapagos extends AppCompatActivity {

    public ImageButton btnRegresar2;
    public ImageButton btnHome2;
    public Button btnFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formapagos);

        btnRegresar2 = findViewById(R.id.btnRegresar2);
        btnHome2 = findViewById(R.id.btnHome2);
        btnFinal = findViewById(R.id.btnFinal);

        btnRegresar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Formapagos.this, Productocafe.class);
                startActivity(intent);

            }
        });

        btnHome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Formapagos.this, MenuCasino.class);
                startActivity(intent);

            }
        });

        btnFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Formapagos.this, Transbankview.class);
                startActivity(intent);

            }
        });

    }

}