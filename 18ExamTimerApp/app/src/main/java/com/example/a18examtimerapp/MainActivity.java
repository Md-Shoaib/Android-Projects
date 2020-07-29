package com.example.a18examtimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variable Declaration
    MediaPlayer m1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign ui elements
        m1 = MediaPlayer.create(this, R.raw.three);

        final TextView mNumber = findViewById(R.id.mNumber);
        final TextView done = findViewById(R.id.done);

        //creating countdown timer
        new CountDownTimer(10000, 1000){

            @Override
            public void onTick(long millisUntilFinished) {

                mNumber.setText("Time: " + String.valueOf(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {

                done.setText("Done!!!");
                m1.start();

            }
        }.start();
    }
}