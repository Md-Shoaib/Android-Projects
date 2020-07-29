package com.example.a17drumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    //Variable declaration

    //Override a method for removing resource good practices
    @Override
    public void onBackPressed() {
        finish();
        System.exit(0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //Setting complete layout using same method
    public void press(View view){

        switch (view.getId()){
            case R.id.imageButton1:
                MediaPlayer m1 = MediaPlayer.create(this, R.raw.one);
                m1.start();
                break;
            case R.id.imageButton2:
                MediaPlayer m2 = MediaPlayer.create(this, R.raw.two);
                m2.start();
                break;
            case R.id.imageButton3:
                MediaPlayer m3 = MediaPlayer.create(this, R.raw.three);
                m3.start();
                break;
            case R.id.imageButton4:
                MediaPlayer m4 = MediaPlayer.create(this, R.raw.four);
                m4.start();
                break;
            case R.id.imageButton5:
                MediaPlayer m5 = MediaPlayer.create(this, R.raw.fv);
                m5.start();
                break;
            case R.id.imageButton6:
                MediaPlayer m6 = MediaPlayer.create(this, R.raw.sixth);
                m6.start();
                break;
            case R.id.imageButton7:
                MediaPlayer m7 = MediaPlayer.create(this, R.raw.seventh);
                m7.start();
                break;
            case R.id.imageButton8:
                MediaPlayer m8 = MediaPlayer.create(this, R.raw.three);
                m8.start();
                break;
            case R.id.imageButton9:
                MediaPlayer m9 = MediaPlayer.create(this, R.raw.two);
                m9.start();
                break;
            case R.id.imageButton10:
                MediaPlayer m10 = MediaPlayer.create(this, R.raw.one);
                m10.start();
                break;
            case R.id.imageButton11:
                MediaPlayer m11 = MediaPlayer.create(this, R.raw.fv);
                m11.start();
                break;
            case R.id.imageButton12:
                MediaPlayer m12 = MediaPlayer.create(this, R.raw.sixth);
                m12.start();
                break;
        }
    }
}