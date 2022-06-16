package com.example.multiscreenapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText ans;
private Button button;
public static final String EXTRA_NAME = "com.example.multiscreenapps.extraName";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ans = findViewById(R.id.ans);
        button = findViewById(R.id.button);
    }

    public  void signupform(View view)
    {
        Toast.makeText(getApplicationContext(), "Sign Up Processing", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        String Naming = ans.getText().toString();
        intent.putExtra(EXTRA_NAME, Naming);
        startActivity(intent);

    }
}