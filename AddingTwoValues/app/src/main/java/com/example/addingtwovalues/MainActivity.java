package com.example.addingtwovalues;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText n1,n2;
TextView textView2;
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        textView2 = findViewById(R.id.textView2);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n3 = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
                textView2.setText("The Addition Of These Values Are :" + n3);
                Toast.makeText(getApplicationContext(), "Thanks For Using This Application", Toast.LENGTH_SHORT).show();
            }
        });



    }
}