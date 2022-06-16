package com.example.on_item_click_listner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView listView;
private  String[] arr ={"Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!","Hello World!"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_single_choice,arr);
        listView.setAdapter(ad);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(MainActivity.this,  "You Clicked On : " + i, Toast.LENGTH_SHORT).show();
            }
        });
    }
}