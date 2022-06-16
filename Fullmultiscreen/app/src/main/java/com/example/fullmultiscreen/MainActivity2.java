package com.example.fullmultiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView val;



@SuppressLint("SetTextI18n")
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    val = findViewById(R.id.val);
    Intent intent = getIntent();
    String name = intent.getStringExtra(MainActivity.EXTRA_NAME);
    val.setText("Dear :" + name + " "  +  "Your Registration Is Submitted Successfully!!!" );

    }
}