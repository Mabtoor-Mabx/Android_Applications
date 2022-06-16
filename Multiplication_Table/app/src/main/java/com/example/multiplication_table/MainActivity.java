package com.example.multiplication_table;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText val;
TextView ans;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val = findViewById(R.id.val);
        ans = findViewById(R.id.ans);
        button = findViewById(R.id.button);

        final String[] text = {""};
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String s = val.getText().toString();
                int a = Integer.parseInt(s);
                for (int i=0;i<10;i++)
                {
                    text[0] =   i + "X" + a + "=" + i*a + "\n";
                    ans.setText(text[i]);
                }



            }
        });
    }

}