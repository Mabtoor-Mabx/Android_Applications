package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button btn;
public  static  final  String EXTRA_NAME = "com.example.multiscreen.extra.name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);

    }

    public  void button(View view)
    {
        Toast.makeText(getApplicationContext(), "Processing", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}