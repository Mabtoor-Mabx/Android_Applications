package com.example.contactinfos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.chapter5ps.CustomAdapter;

public class MainActivity extends AppCompatActivity {
Contact o1 = new Contact(1, "0300123445", "Mabtoor");
Contact o2 = new Contact(2, "0300123445", "Mabtoor");
Contact o3 = new Contact(3, "0300123445", "Mabtoor");
Contact o4 = new Contact(4, "0300123445", "Mabtoor");
Contact o5 = new Contact(5, "0300123445", "Mabtoor");
Contact o6 = new Contact(6, "0300123445", "Mabtoor");

Contact [] contacts = {o1,o2,o3,o4,o5,o6};
RecyclerView   recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        CustomAdapter c = new CustomAdapter(contacts);
        recyclerView.setAdapter(c);
    }
}