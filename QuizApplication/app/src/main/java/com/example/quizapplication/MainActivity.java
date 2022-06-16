package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  String[] questions = {"Android Created in 2003?", "Android Use Only Java Language?", "Android Have GUI Interface", "Android is Web Server", "Android Has Apache Server", "Apk Stands For Android Phone Kit!"};
    private Boolean[] answers = {true,false,true,false, true,true};
    private  int score = 0;
    private int index = 0;
    Button btn;
    Button btn2;
    TextView question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);
        question = findViewById(R.id.question);
        question.setText(questions[index]);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index<questions.length-1)
                {
                    if (answers[index])
                    {
                        score++;
                    }
                    index++;
                    if (index<questions.length-1)
                    {
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Your Score Is : " + score, Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "Restart The APP To Play Again", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index<questions.length-1)
                {
                    if (!answers[index])
                    {
                        score++;
                    }
                    index++;
                    if (index<questions.length-1)
                    {
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Your Score Is : " + score, Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "Restart The APP To Play Again", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}