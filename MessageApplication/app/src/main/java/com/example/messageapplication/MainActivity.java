package com.example.messageapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

private Button button;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        textView2 = findViewById(R.id.textView2);
        button = findViewById(R.id.button);
        textView2.setText("Welcome! Have A Nice Day!!!");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Good Morning and  Welcome! Have a Nice Day!!!",Toast.LENGTH_SHORT).show();
            }
        });
        
        
    }
}