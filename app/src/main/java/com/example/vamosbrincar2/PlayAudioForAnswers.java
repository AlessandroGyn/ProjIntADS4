package com.example.vamosbrincar2;

import android.content.Context;
import android.media.MediaPlayer;

public class PlayAudioForAnswers {


    private Context mContext;
    private MediaPlayer mediaPlayer;

    public PlayAudioForAnswers(Context mContext) {
        this.mContext = mContext;
    }



    public void setAudioforAnswer(int flag){

        switch (flag){

            case 1:
                int correctAudio = R.raw.correto;
                playMusic(correctAudio);
                break;
            case 2:
                int wrongAudio = R.raw.errado;
                playMusic(wrongAudio);
                break;
            case 3:
                int timerAudio = R.raw.timetick;
                playMusic(timerAudio);
                break;
            case 4:
                int a = R.raw.a;
                playMusic(a);
                break;
            case 5:
                int b = R.raw.b;
                playMusic(b);
                break;
            case 6:
                int c = R.raw.c;
                playMusic(c);
                break;
            case 7:
                int d = R.raw.d;
                playMusic(d);
                break;
            case 8:
                int e = R.raw.e;
                playMusic(e);
                break;
            case 9:
                int f = R.raw.f;
                playMusic(f);
                break;
            case 10:
                int j = R.raw.j;
                playMusic(j);
                break;
            case 11:
                int r = R.raw.r;
                playMusic(r);
                break;
            case 12:
                int w = R.raw.w;
                playMusic(w);
                break;
            case 13:
                int x = R.raw.x;
                playMusic(x);
                break;
                //a(4), b(5), c(6), d(7), e(8), f(9), j(10), r(11), w(12), x(13)
        }

    }

    private void playMusic(int audiofile) {

        mediaPlayer = MediaPlayer.create(mContext,audiofile);

        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mediaPlayer.start();
            }
        });

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.release();
            }
        });



    }

}
