package com.example.sharedpreferencesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText editText;
TextView textView;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.edittext);

        SharedPreferences sp = getSharedPreferences("My Prefs", MODE_PRIVATE);
          String s = sp.getString("Name", "No Value Currently");
          textView.setText(s);


          button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  String value = editText.getText().toString();
                  SharedPreferences sp = getSharedPreferences("My Prefs", MODE_PRIVATE);
                  SharedPreferences.Editor ed = sp.edit();
                   ed.putString("Name", value);
                  ed.apply();
                  textView.setText(value);
              }
          });



    }
}