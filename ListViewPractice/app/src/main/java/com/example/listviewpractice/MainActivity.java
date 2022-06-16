package com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private ListView listview;
private  String[] arr = {"Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!","Good Evening!"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listview);
        ArrayAdapter ad =   new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, arr);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(MainActivity.this, "You Clicked On:" + i, Toast.LENGTH_SHORT).show();
            }
        });
        listview.setAdapter(ad);
    }
}