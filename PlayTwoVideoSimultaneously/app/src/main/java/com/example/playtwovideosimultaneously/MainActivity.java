package com.example.playtwovideosimultaneously;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
Button play,play2,playandpause;
SurfaceView surfaceView ;
SurfaceView surfaceView2;
MediaPlayer mediaPlayer, mediaPlayer2;
SeekBar seekBar, seekBar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = findViewById(R.id.play);
        play2 = findViewById(R.id.play2);
        seekBar = findViewById(R.id.seekBar);
        seekBar2 = findViewById(R.id.seekBar2);
        playandpause = findViewById(R.id.playandpause);
        surfaceView = findViewById(R.id.surfaceView);
        surfaceView2 = findViewById(R.id.surfaceView2);
        mediaPlayer = MediaPlayer.create(this, R.raw.vid);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.vid2);
        surfaceView2.setKeepScreenOn(true);
        surfaceView.setKeepScreenOn(true);

        SurfaceHolder surfaceHolder = surfaceView.getHolder();
        SurfaceHolder surfaceHolder2  = surfaceView2.getHolder();

        surfaceHolder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder holder) {
                mediaPlayer.setDisplay(surfaceHolder);
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

            }
        });

        surfaceHolder2.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder holder) {
                mediaPlayer2.setDisplay(surfaceHolder2);
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

            }
        });

        seekBar.setMax(mediaPlayer.getDuration());
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
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

        seekBar2.setMax(mediaPlayer2.getDuration());
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mediaPlayer2.seekTo(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });




        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying())
                {
                    mediaPlayer.pause();
                    play.setText("Play");
                }
                else
                {
                    mediaPlayer.start();
                    play.setText("Pause");
                }
            }
        });

        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer2.isPlaying())
                {
                    mediaPlayer2.pause();
                    play2.setText("Play");
                }
                else
                {
                    mediaPlayer2.start();
                    play2.setText("Pause");
                }
            }
        });

        playandpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying() && mediaPlayer2.isPlaying())
                {
                    mediaPlayer.pause();
                    mediaPlayer2.pause();
                    playandpause.setText("Play Both Videos");
                }
                else
                {
                    mediaPlayer.start();
                    mediaPlayer2.start();
                    playandpause.setText("Pause Both Videos");
                }
            }
        });


    }
}