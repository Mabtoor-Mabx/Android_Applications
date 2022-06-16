package com.example.finaloneunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText editTextNumber;
private TextView textView4;
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber = findViewById(R.id.editTextNumber);
        textView4 = findViewById(R.id.textView4);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editTextNumber.getText().toString();
                int a = Integer.parseInt(s);
                double kg =  2.205  * a;
                textView4.setText("The Value In Pound Is :"  + kg);
            }
        });


    }
}