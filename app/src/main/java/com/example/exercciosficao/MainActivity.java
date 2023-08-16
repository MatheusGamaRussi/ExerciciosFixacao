package com.example.exercciosficao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void paraCardapio(View view){
        Intent exercicioCardapio = new Intent(this, CardapioActivity.class);
        startActivity(exercicioCardapio);
    }

    public void paraHorario(View view){
        Intent exercicioHorario = new Intent(this, HorarioActivity.class);
        startActivity(exercicioHorario);
    }
}