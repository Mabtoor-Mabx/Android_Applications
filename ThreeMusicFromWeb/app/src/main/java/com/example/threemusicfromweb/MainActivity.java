package com.example.threemusicfromweb;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
SeekBar seekBar,seekBar2,seekBar3;
Button button,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar = findViewById(R.id.seekBar);
        seekBar2 = findViewById(R.id.seekBar2);
        seekBar3 = findViewById(R.id.seekBar3);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        MediaPlayer mediaPlayer = new MediaPlayer();
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        MediaPlayer mediaPlayer3 = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("http://songs.apniisp.com/Drama%20OST%20Songs/HumTV/59%20-%20Hum%20Kahan%20Ke%20Sachay%20Thay%20-%20OST%20-%20HUM%20TV%20(ApniISP.Com).mp3");
        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {

                Toast.makeText(getApplicationContext(), "Processing", Toast.LENGTH_SHORT).show();
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

            }
        });
        mediaPlayer.prepareAsync();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying())
                {
                    mediaPlayer.pause();
                    button.setText("Play");
                }
                else {
                    mediaPlayer.start();
                    button.setText("Pause");
                }
            }
        });




        try {
            mediaPlayer2.setDataSource("http://songs.apniisp.com/Drama%20OST%20Songs/HumTV/57%20-%20Parizaad%20-%20OST%20-%20HUM%20TV%20(ApniISP.Com).mp3");
        } catch (IOException e) {
            e.printStackTrace();
        }

        mediaPlayer2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {

                Toast.makeText(getApplicationContext(), "Processing", Toast.LENGTH_SHORT).show();
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


            }
        });

        mediaPlayer2.prepareAsync();





        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer2.isPlaying())
                {
                    mediaPlayer2.pause();
                    button2.setText("Play");
                }
                else {
                    mediaPlayer2.start();
                    button2.setText("Pause");
                }
            }
        });



        try {
            mediaPlayer3.setDataSource("http://songs.apniisp.com/Drama%20OST%20Songs/HumTV/53%20-%20Raqs-e-Bismil%20-%20OST%20-%20HUM%20TV%20(ApniISP.Com).mp3");
        } catch (IOException e) {
            e.printStackTrace();
        }

        mediaPlayer3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                Toast.makeText(getApplicationContext(), "Processing", Toast.LENGTH_SHORT).show();
                seekBar3.setMax(mediaPlayer3.getDuration());
                seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        mediaPlayer3.seekTo(progress);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                });



            }
        });

        mediaPlayer3.prepareAsync();

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer3.isPlaying())
                {
                    mediaPlayer3.pause();
                    button3.setText("Play");
                }
                else {
                    mediaPlayer3.start();
                    button3.setText("Pause");
                }
            }
        });



    }
}