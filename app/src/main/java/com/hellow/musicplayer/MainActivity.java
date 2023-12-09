package com.hellow.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Instantiating the MediaPlayer class



        // Adding the music file to our
        // newly created object music
        music = MediaPlayer.create(
                this, R.raw.jjj);
    }

            // Playing the music
            public void musicplay(View v)
            {
                music.start();
            }

            // Pausing the music
            public void musicpause(View v)
            {
                music.pause();
            }

            // Stopping the music
            public void musicstop(View v)
            {
                music.stop();
                music
                        = MediaPlayer.create(
                        this, R.raw.jjj);
            }
        }


