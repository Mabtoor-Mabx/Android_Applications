package com.example.mabxplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;

public class Playsong extends AppCompatActivity {
TextView textView2;
ImageView play,next,previous;
SeekBar seekBar;
ArrayList<File> Songs;
MediaPlayer mediaPlayer;
String textcontent;
int postion;
Thread updateseek;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop();
        mediaPlayer.release();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playsong);
        textView2 = findViewById(R.id.textView2);
        seekBar = findViewById(R.id.seekBar);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Songs = (ArrayList) bundle.getParcelableArrayList("songlist");
        textcontent = intent.getStringExtra("currentsong");
        textView2.setText(textcontent);
        postion = intent.getIntExtra("position", 0);
        Uri uri = Uri.parse(Songs.get(postion).toString());
        mediaPlayer = MediaPlayer.create(this, uri);
        mediaPlayer.start();

        seekBar.setMax(mediaPlayer.getDuration());

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                mediaPlayer.seekTo(seekBar.getProgress());
            }
        });

        updateseek = new Thread(){
            @Override
            public void run() {
               int currentposition = 0;
               try {
                        while (currentposition<mediaPlayer.getDuration()){
                           currentposition = mediaPlayer.getDuration();
                           seekBar.setProgress(currentposition);
                           sleep(800);

                        }
               }
               catch (Exception e){
                    e.printStackTrace();
               }
                updateseek.start();
            }
        };

//        play.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(mediaPlayer.isPlaying())
//                {
//                    play.setImageResource(R.drawable.play);
//                    mediaPlayer.pause();
//                }
//                else
//                {
//                    play.setImageResource(R.drawable.pause);
//                    mediaPlayer.start();
//                }
//            }
//        });
//
//        previous.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mediaPlayer.stop();
//                mediaPlayer.release();
//                if(postion!=0)
//                {
//                    postion= postion-1;
//                }
//                else
//                {
//                    postion = Songs.size()-1;
//                }
//
//                Uri uri = Uri.parse(Songs.get(postion).toString());
//                mediaPlayer = MediaPlayer.create(getApplicationContext(), uri);
//                mediaPlayer.start();
//                play.setImageResource(R.drawable.pause);
//                seekBar.setMax(mediaPlayer.getDuration());
//                textcontent = Songs.get(postion).getName().toString();
//                textView2.setText(textcontent);
//
//
//            }
//        });
//
//
//
//        next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mediaPlayer.stop();
//                mediaPlayer.release();
//                if(postion!=Songs.size()-1){
//                    postion = postion + 1;
//                }
//                else{
//                    postion = 0;
//                }
//                Uri uri = Uri.parse(Songs.get(postion).toString());
//                mediaPlayer = MediaPlayer.create(getApplicationContext(), uri);
//                mediaPlayer.start();
//                play.setImageResource(R.drawable.pause);
//                seekBar.setMax(mediaPlayer.getDuration());
//                textcontent = Songs.get(postion).getName().toString();
//                textView2.setText(textcontent);
//
//            }
//        });



    }
}