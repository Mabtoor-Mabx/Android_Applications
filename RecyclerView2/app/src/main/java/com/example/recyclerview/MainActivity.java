package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewapp.CustomAdapter;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerview;

String [] arr = {"Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View","Recycler View"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview= findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter cd = new CustomAdapter(arr);
        recyclerview.setAdapter(cd);
    }
}