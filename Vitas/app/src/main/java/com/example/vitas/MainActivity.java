package com.example.vitas;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button playButton;
    MediaPlayer mp;
    TextView tv;
    boolean isPlaying = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         playButton = (Button) findViewById(R.id.playVitas);
         playButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(isPlaying){
            mp.pause();
            isPlaying = false;
        }
        mp = MediaPlayer.create(this, R.raw.vitas);

        if(!isPlaying){
            mp.start();
            isPlaying = true;
        }


    }
}
