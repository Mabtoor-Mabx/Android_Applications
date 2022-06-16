package com.example.multiplepages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView answer;
private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        answer  = findViewById(R.id.answer);
        Intent intent = getIntent();
        String name =  intent.getStringExtra( MainActivity.EXTRA_NAME);
        answer.setText("Dear : " + name  + " You Have Logged In Suuccessfully!");

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1  = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}