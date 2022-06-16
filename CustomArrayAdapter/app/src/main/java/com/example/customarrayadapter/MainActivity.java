package com.example.customarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
ListView listview;
private String arr [] = {"Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listview);
        CustomMabtoorAdapter ad = new CustomMabtoorAdapter(this, R.layout.my_mabtoor_custom_layout, arr);
        listview.setAdapter(ad);
    }
}