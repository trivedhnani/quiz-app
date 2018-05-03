package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
EditText e1;
Button b;
int score1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        e1=(EditText)findViewById(R.id.et1);
        b=(Button)findViewById(R.id.but);
        score1=getIntent().getExtras().getInt("score",0);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(e1.getText().toString().equals("andromeda")){
                    score1=score1+10;
                    Toast.makeText(getApplicationContext(),"Correct \n"+String.valueOf(score1),Toast.LENGTH_SHORT).show();
                }

                else{
                    score1=score1-10;
                    Toast.makeText(getApplicationContext(),"Wrong \n"+String.valueOf(score1),Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
