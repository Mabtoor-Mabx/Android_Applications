package com.example.recycling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewapp.CustomAdapter;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
String [] arr = {"Recycling The Best Way!!","Recycling The Best Way!!","Recycling The Best Way!!","Recycling The Best Way!!","Recycling The Best Way!!","Recycling The Best Way!!","Recycling The Best Way!!","Recycling The Best Way!!","Recycling The Best Way!!","Recycling The Best Way!!","Recycling The Best Way!!","Recycling The Best Way!!","Recycling The Best Way!!","Recycling The Best Way!!","Recycling The Best Way!!","Recycling The Best Way!!",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter cd = new CustomAdapter(arr);
        recyclerView.setAdapter(cd);
    }
}