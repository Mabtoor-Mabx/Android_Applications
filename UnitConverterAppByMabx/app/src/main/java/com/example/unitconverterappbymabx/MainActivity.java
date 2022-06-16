package com.example.unitconverterappbymabx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editTextTextPersonName;
    private TextView textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =  findViewById(R.id.button);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        textView5 = findViewById(R.id.textView5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = editTextTextPersonName.getText().toString();
                int a = Integer.parseInt(s);
                double kg =   2.205 * a;
                textView5.setText("The Value In Pound Is :" + kg);


            }
        });
    }
}