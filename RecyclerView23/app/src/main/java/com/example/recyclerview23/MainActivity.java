package com.example.recyclerview23;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
String [] arr = {"Recycle 1","Recycle 2","Recycle 3","Recycle 4","Recycle 5","Recycle 6","Recycle 7",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c  = new CustomAdapter(arr);
        recyclerView.setAdapter(c);

    }
}