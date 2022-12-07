package com.example.vamosbrincar2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnVamosBrincar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVamosBrincar = findViewById(R.id.btnVamosBrincar);
        btnVamosBrincar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent playActivity = new Intent(this,PlayActivity.class);
        startActivity(playActivity);
        Toast.makeText(this, "Responda as perguntas dentro do tempo", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Você é o melhor!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}