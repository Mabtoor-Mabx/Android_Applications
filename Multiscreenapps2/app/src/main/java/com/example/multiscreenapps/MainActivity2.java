package com.example.multiscreenapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        String Name = intent.getStringExtra(MainActivity.EXTRA_NAME);
        textView.setText("Dear  " + Name  +" !!! " +  " Your Registration Have Submitted Successfully!!!!");

    }
}