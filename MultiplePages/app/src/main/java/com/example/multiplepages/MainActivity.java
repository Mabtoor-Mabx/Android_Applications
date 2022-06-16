package com.example.multiplepages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button btn;
private EditText name;
public  static  final  String EXTRA_NAME = "com.example.multiplepages.extra_name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= findViewById(R.id.btn);
        name = findViewById(R.id.name);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Processing", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                String naming = name.getText().toString();
                intent.putExtra(EXTRA_NAME,naming);
                startActivity(intent);

            }
        });

    }
}