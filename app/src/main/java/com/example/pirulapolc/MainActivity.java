package com.example.pirulapolc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnIndito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btnIndito.setOnClickListener(view -> {
            Intent beallitasokhoz = new Intent(MainActivity.this, BeallitasokFragment.class);
            startActivity(beallitasokhoz);
            finish();
        });


    }



    private void init() {
        btnIndito = findViewById(R.id.btnIndito);
    }
}