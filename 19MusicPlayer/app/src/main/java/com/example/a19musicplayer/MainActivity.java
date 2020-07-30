package com.example.a19musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    //Variable Declaration
    MediaPlayer mediaPlayer;
    AudioManager audioManager; //This class for all kind of audio Managing services

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting media player
        mediaPlayer = MediaPlayer.create(this, R.raw.testaudio);

        //Setting seekbar and using audio manager
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE); //Get context from audio services
        int myMaxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int myCurrentVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

        SeekBar volumeRocker = findViewById(R.id.seekBar);
        volumeRocker.setMax(myMaxVolume);
        volumeRocker.setProgress(myCurrentVolume);

        //set a listener on volume rocker
        volumeRocker.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //Setting timeline

        final SeekBar timeLine = findViewById(R.id.timeline);
        timeLine.setMax(mediaPlayer.getDuration()); //maximum the bar goes

        //listner on timeline
        timeLine.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mediaPlayer.seekTo(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //customize tracking of timeline by using timer
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                timeLine.setProgress(mediaPlayer.getCurrentPosition());

            }
        },0, 1000);
    }

    //Methods
    public void playMe(View view) {

        mediaPlayer.start();
    }

    public void pauseMe(View view) {

        mediaPlayer.pause();
    }
}