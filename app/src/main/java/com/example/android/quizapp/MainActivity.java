package com.example.android.quizapp;

import android.content.Intent;
import android.content.res.Resources;
import android.icu.util.TimeUnit;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
TextView c,q;
Button b1,b2,b3,b4,b5;
int i=0,j;
private questions question=new questions();
private String manswer;
private int mScore=0;
private int mQuestionLength=question.mquestions.length;
Random F;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        F=new Random();
        c=(TextView)findViewById(R.id.count);
        q=(TextView)findViewById(R.id.que);
        b1=(Button)findViewById(R.id.but1);
        b2=(Button)findViewById(R.id.but2);
        b3=(Button)findViewById(R.id.but3);
        b4=(Button)findViewById(R.id.but4);
        b5=(Button)findViewById(R.id.but5);
       updateQuestion(i);
       b1.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
                if(b1.getText()==manswer){
                    mScore=mScore+10;

                    i++;


                }
                else{

                    mScore=mScore-10;
                    i++;


                }
           }
       });
       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(b2.getText()==manswer){
                   mScore=mScore+10;


                   i++;

               }
               else{

                   mScore=mScore-10;

                   i++;


               }
           }
       });
       b3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(b3.getText()==manswer){
                   mScore=mScore+10;


                   i++;


               }
               else{

                   mScore=mScore-10;

                   i++;



               }
           }
       });
       b4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(b4.getText()==manswer){
                   mScore=mScore+10;


                   i++;

               }
               else{

                   mScore=mScore-10;

                   i++;


               }
           }
       });
       b5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(getApplicationContext(),"Score"+String.valueOf(mScore),Toast.LENGTH_SHORT).show();
               if(i>=3){
                   Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                   intent.putExtra("score",mScore);
                   startActivity(intent);

               }
               else
               updateQuestion(i);
           }
       });
    }

    private void updateQuestion(int num) {
        q.setText(question.getQuestions(num));
        b1.setText(question.getChoice1(num));
        b2.setText(question.getChoice2(num));
        b3.setText(question.getChoice3(num));
        b4.setText(question.getChoice4(num));
        manswer=question.getCorrectAnswer(num);
    }


}
