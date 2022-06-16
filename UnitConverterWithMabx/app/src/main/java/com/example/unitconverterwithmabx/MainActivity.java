package com.example.unitconverterwithmabx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText editTextNumber2;
private TextView textview3;
private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        textview3 = findViewById(R.id.textView3);
        button = findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String s = editTextNumber2.getText().toString();
//                int a = Integer.parseInt(s);
//                double kg = 2.205 * a;
//                textview3.setText("The Value In Pound Is :" + kg);
//
//            }
//        });
//
    }

    public void calculate(View view ){
        String s = editTextNumber2.getText().toString();
        int a = Integer.parseInt(s);
        double kg = 2.205 * a;
        textview3.setText("The Value In Pound Is :" + kg);
    }

}