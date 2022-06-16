package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;
    EditText n1,n2;
    TextView ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        ans = findViewById(R.id.ans);

    }
    public void add(View view)
    {
         int add =Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
         ans.setText("The Addition Of Two value is : " + add);
        Toast.makeText(getApplicationContext(), "Thanks For Using This Application!!!!", Toast.LENGTH_SHORT).show();
    }

    public void Sub(View view)
    {
        int sub = Integer.parseInt(n1.getText().toString()) - Integer.parseInt(n2.getText().toString());
        ans.setText("The Addition Of Two value is : " + sub);
        Toast.makeText(getApplicationContext(), "Thanks For Using This Application!!!!", Toast.LENGTH_SHORT).show();

    }

    public void mult(View view)
    {
        int mult = Integer.parseInt(n1.getText().toString()) * Integer.parseInt(n2.getText().toString());
        ans.setText("The Addition Of Two value is : " + mult);
        Toast.makeText(getApplicationContext(), "Thanks For Using This Application!!!!", Toast.LENGTH_SHORT).show();

    }

    public void Div(View view)
    {
        double div = Integer.parseInt(n1.getText().toString()) / Integer.parseInt(n2.getText().toString());
        ans.setText("The Addition Of Two value is : " + div);
        Toast.makeText(getApplicationContext(), "Thanks For Using This Application!!!!", Toast.LENGTH_SHORT).show();


    }

}