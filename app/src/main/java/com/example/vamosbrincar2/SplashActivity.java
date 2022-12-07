package com.example.vamosbrincar2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;


public class SplashActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide(); // esconder a actionBar
        // comando abaixo: esta activity vai ser exibida em tela cheia
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        // Carregando audio do diretório res/raw
        MediaPlayer player = MediaPlayer.create(this, R.raw.abertura);
        player.start(); // inicia o som de abertura



        // cria esta splash screen na tread principal
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                startActivity(new Intent(getBaseContext(),
                        MainActivity.class)); // abre a main activity

                player.release();
                finish(); // finaliza a splash
            }
        },4000); // depois de 4 segundos executa o metodo run
    }
}