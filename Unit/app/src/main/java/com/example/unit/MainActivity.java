package com.example.unit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button btn;
private EditText val;
private TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btn = findViewById(R.id.btn);
    val = findViewById(R.id.val);
    ans = findViewById(R.id.ans);

    btn.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v) {
            String s = val.getText().toString();
            int a = Integer.parseInt(s);
            double pound = 2.205 * a;
            ans.setText("Your Answer In Pound Is : "+ pound);
            Toast.makeText(getApplicationContext(), "Thanks For Using This Application!!!", Toast.LENGTH_SHORT).show();
        }
    });



    }
}