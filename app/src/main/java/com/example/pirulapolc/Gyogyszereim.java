package com.example.pirulapolc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Gyogyszereim extends AppCompatActivity {
    private RecyclerView rvGyogyszerLista;

    private Button btnVissza;
    private Button btnHozzaad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyogyszereim);
        init();

        btnVissza.setOnClickListener(view -> {
            Intent visszaMenube = new Intent(Gyogyszereim.this, Menu.class);
            startActivity(visszaMenube);
            finish();

        });
    }

    private void init() {
        rvGyogyszerLista = findViewById(R.id.gyogyszerLista);
        btnVissza = findViewById(R.id.btnVissza);
        btnHozzaad = findViewById(R.id.btnHozzaad);
    }
}