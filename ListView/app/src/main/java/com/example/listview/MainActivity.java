package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView listView;
private  String[] arr = {" Roll No 1 is  Mabtoor", " Roll No 2 is  Horair"," Roll No 3 is  Waqas", " Roll No 4 is  Waheed", " Roll No 5 is  Hasnat"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView  = findViewById(R.id.listview);
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_selectable_list_item, arr);
        listView.setAdapter(ad);

    }
}