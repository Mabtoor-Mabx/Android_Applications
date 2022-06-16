package com.example.explicitintent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button btn;
private EditText val;
public static final String EXTRA_NAME = "om.example.explicitintent2.extra.value";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        val = findViewById(R.id.val);
        Intent intent = new Intent(this, MainActivity2.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Processing!", Toast.LENGTH_SHORT).show();
                String Naming = val.getText().toString();
                intent.putExtra(EXTRA_NAME, Naming);
                startActivity(intent);
            }
        });

    }



}