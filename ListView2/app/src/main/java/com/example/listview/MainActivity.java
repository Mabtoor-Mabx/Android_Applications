package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView listview;
private String[] arr = {"Arr1","Arr2","Arr3","Arr4","Arr5","Arr6","Arr7","Arr8","Arr9","Arr10","Arr11","Arr12","Arr13"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listview);
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_selectable_list_item, arr);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(MainActivity.this, "You Have Clicked On:" + i, Toast.LENGTH_SHORT).show();
            }
        });
        listview.setAdapter(ad);
    }
}