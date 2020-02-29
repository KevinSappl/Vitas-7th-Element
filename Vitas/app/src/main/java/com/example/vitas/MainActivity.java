package com.example.vitas;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button playButton;
    MediaPlayer mp;
    boolean isPlaying = false;
    private int currentPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playButton = findViewById(R.id.playVitas);
        playButton.setOnClickListener(this);
        mp = MediaPlayer.create(this, R.raw.vitas);
        mp.setLooping(true);
    }

    @Override
    public void onClick(View v) {
        if (isPlaying) {
            mp.pause();
            currentPosition = mp.getCurrentPosition();
            isPlaying = false;
        } else {
            mp.seekTo(currentPosition);
            mp.start();
            isPlaying = true;
        }
    }
}