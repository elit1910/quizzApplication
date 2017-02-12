package com.example.quizzapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

import static android.R.attr.name;
import static android.R.attr.start;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //create an Array with both Booleans and Strings
    Boolean[] answers = new Boolean[]{true, false, false, false, true, true, true, true, true, true, false};

    //String[] fragor = getResources().getStringArray(R.array.quizz);

    String[] fragor = new String[]{"Is Australia a Continent?","Is New Guinea the world third largest island?",
    "is Turkmenistan and Turkey neighbours?", "Tajikistan is not a real country?","Uzbekistan is neighbours with both Kazakstan and Kyrgyzstan?", "Rwanda is called Little Africa?",
    "Sait Helena\'s capital is Georgetown?","Roof of the World is Tibet","Bangladesh has 156.6 million inhabitants?","Tehran is the Capital of Iran?","Ceylon is the former name of Madagascar?"};



    //Log.v("MainActivity", fragor);
    //Array Objects = [];

    int i =0;
    Boolean svar;


    public boolean Sant1(View v) {
        svar = true;
        startQuizz(svar);
        return svar;
    }

    public boolean Fel2(View v){
        svar= false;
        startQuizz(svar);
        return svar;

    }

    public void start(View view){

        displaymessageArray(fragor);

    }

    public void displaymessage(String text){
        TextView meddelande = (TextView) findViewById(R.id.text);
        meddelande.setText(text);}


    public void displaymessageArray(String fragor[]){
        TextView meddelande = (TextView) findViewById(R.id.text);
        meddelande.setText(fragor[i]);}

    public int startQuizz(Boolean svar){



        if (svar==answers[i]){
            displaymessage(getString(R.string.ratt));
        }
        else{
            displaymessage(getString(R.string.fel));
        }

        //Question ()

        i = ++i;

        return i;
        }





        }
