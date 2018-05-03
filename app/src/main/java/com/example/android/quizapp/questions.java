package com.example.android.quizapp;

import java.security.PublicKey;

/**
 * Created by Hp on 4/30/2018.
 */

public class questions {
    public String mquestions[]={
            "What is the nearest star to the earth except sun?","Denis Suárez is a famous...","Europa is a moon of"
    };
    private String moptions[][]={
            {"proxima centauri","kepler 22b","kepler 15b","andromeda"},
            {"cricketer","football player"," volley ball player","golf player"},
            {"Jupiter","Saturn","Venus","Pluto"}
    };
private String mCorrectanswers[]={"proxima centauri","football player","Jupiter"};
public String getQuestions(int a){
 String question= mquestions[a];
 return question;
}
    public  String getChoice1(int a){
    String choice=moptions[a][0];
    return choice;
    }
    public  String getChoice2(int a){
        String choice=moptions[a][1];
        return choice;
    }
    public  String getChoice3(int a){
        String choice=moptions[a][2];
        return choice;
    }
    public  String getChoice4(int a){
        String choice=moptions[a][3];
        return choice;
    }
    public String getCorrectAnswer(int a){
        String answer=mCorrectanswers[a];
        return answer;
    }
}
