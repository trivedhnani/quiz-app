package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
int mscore;
CheckBox c1,c2,c3,c4;
Button c5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mscore=getIntent().getExtras().getInt("score",0);
        c1=(CheckBox)findViewById(R.id.but1);
        c2=(CheckBox)findViewById(R.id.but2);
        c3=(CheckBox)findViewById(R.id.but3);
        c4=(CheckBox)findViewById(R.id.but4);
        c5=(Button)findViewById(R.id.but5);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c3.isChecked()){
                    mscore=mscore+10;
                Toast.makeText(getApplicationContext(),"correct "+"\n"+"score"+String.valueOf(mscore),Toast.LENGTH_SHORT).show();
                Intent i2=new Intent(getApplicationContext(),Main3Activity.class);
                i2.putExtra("score",mscore);
                startActivity(i2);
            }
            else{
                    mscore=mscore-10;
                    Toast.makeText(getApplicationContext(),"wrong "+"\n"+"score"+String.valueOf(mscore),Toast.LENGTH_SHORT).show();
                    Intent i2=new Intent(getApplicationContext(),Main3Activity.class);
                    i2.putExtra("score",mscore);
                    startActivity(i2);
                }
            }
        });
    }}
