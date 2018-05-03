package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
int mscore=0;
RadioButton r1,r2,r3,r4;
Button r5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mscore=getIntent().getExtras().getInt("score",0);
        r1=(RadioButton) findViewById(R.id.but1);
        r2=(RadioButton) findViewById(R.id.but2);
        r3=(RadioButton)findViewById(R.id.but3);
        r4=(RadioButton)findViewById(R.id.but4);
        r5=(Button)findViewById(R.id.but5);
        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r1.isChecked()){
                    mscore=mscore+10;
                    Toast.makeText(getApplicationContext(),"correct "+"\n"+"score"+String.valueOf(mscore),Toast.LENGTH_SHORT).show();
                    Intent i2=new Intent(getApplicationContext(),Main4Activity.class);
                    i2.putExtra("score",mscore);
                    startActivity(i2);
                }
                else{
                    mscore=mscore-10;
                    Toast.makeText(getApplicationContext(),"wrong "+"\n"+"score"+String.valueOf(mscore),Toast.LENGTH_SHORT).show();
                    Intent i2=new Intent(getApplicationContext(),Main4Activity.class);
                    i2.putExtra("score",mscore);
                    startActivity(i2);
                }
            }
        });
    }
}
