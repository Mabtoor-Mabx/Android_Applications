package com.example.quizapplication20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 private String [] question = {"IS WEB Helpful?", "HTML IS Programming Language?", "CSS Stands For Cascading Style Sheet", "JS Is Helpful In WEB", "REACT IS DEAD IN WEB", "People Still Used PHP", "NODE IS Front End Framework", "DATABase IS Used In WEB Developement?", "WEB HAVE FUTURE?", "WEB AND ANDROID IS Same?"};
 private  Boolean[] answers = {true,false,true,true,false,true,false,true,true,false};
 private int index = 0;
 private int score =0;
 private TextView questions;
 private Button yes;
 private Button no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questions = findViewById(R.id.questions);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        questions.setText(question[index]);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index<question.length-1)
                {
                    if (answers[index])
                    {
                        score++;
                    }
                    index++;
                    if (index<question.length-1)
                    {
                        questions.setText(question[index]);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Your Score Is :" + score + "Out Of " + questions.length(), Toast.LENGTH_SHORT).show();
                    }

                }
                else {
                    Toast.makeText(getApplicationContext(), "Restart The App To Play Again!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });



        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<question.length-1)
                {
                    if (!answers[index])
                    {
                        score++;
                    }
                    index++;

                    if(index<question.length-1)
                    {
                        questions.setText(question[index]);
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your Score Is :" + score + "Out OF " + question.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(), "Restart The App To Play Again", Toast.LENGTH_SHORT).show();
                }
            }
        });











    }
}