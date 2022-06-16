package com.example.javaquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private String[] questions = {"Java Is Human?", "Java Is Low Level language?", "Java Have GUI Interface?", "Java Is Designed For Developers?", "Java Is Written In C++?", "Java is Created By Sun Microorganism?", "James Gosling Invented Java?", "Java Is Used In Operating System?", "Java Have OOP Concepts?", "Java Used Assembler Translator?"};
private Boolean[] answers ={false,false,true,true,false,true,true,true,true,false};
private int index = 0;
private int score = 0;
Button yes;
Button no;
TextView question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question = findViewById(R.id.question);
        question.setText(questions[index]);

        yes.setOnClickListener(new View.OnClickListener() {
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
                        question.setText(questions[index+1]);
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your Score is :  "  + score + "  Out of  " + questions.length, Toast.LENGTH_SHORT).show();
                    }

                }
                else{
                    Toast.makeText(getApplicationContext(), "Restart The Application To Play Again!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });



        no.setOnClickListener(new View.OnClickListener() {
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
                        question.setText(questions[index+1]);
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Your Score Is  " + score + "  Out Of " + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Restart The Application To Play Again!!!!", Toast.LENGTH_SHORT).show();
                }

            }
        });





    }
}