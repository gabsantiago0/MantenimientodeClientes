package com.gabrielsantiago.mantenimientodeclientes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton botonAdd = findViewById(R.id.floatingActionButtonAdd);

        botonAdd.setOnClickListener(v -> {
            Intent intent = new Intent(this, FormularioActivity.class);
            startActivity(intent);
        });

    }
}