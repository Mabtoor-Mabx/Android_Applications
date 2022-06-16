package com.example.contactitems;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.chapter5ps.CustomAdapter;

public class MainActivity extends AppCompatActivity {
Contact o1 = new Contact(1, "Mabtoor", "91819");
Contact o2 = new Contact(1, "Mabtoor", "91819");
Contact o3 = new Contact(1, "Mabtoor", "91819");
Contact o4 = new Contact(1, "Mabtoor", "91819");
Contact o5 = new Contact(1, "Mabtoor", "91819");

Contact[] contacts = {o1,o2,o3,o4,o5};
RecyclerView recyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c = new CustomAdapter(contacts);
        recyclerview.setAdapter(c);
    }
}