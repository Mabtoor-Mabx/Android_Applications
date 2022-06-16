package com.example.recyclerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewapp.CustomAdapter;

public class MainActivity extends AppCompatActivity {
RecyclerView recycle;
String [] arr = {"Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2","Recycle View Part 2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycle = findViewById(R.id.recycle);
        recycle.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter cd = new CustomAdapter(arr);
        recycle.setAdapter(cd);

    }
}