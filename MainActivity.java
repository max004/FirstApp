package com.example.max.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.*;

public class MainActivity extends AppCompatActivity {
    int anzahl = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){


        if(anzahl == 1) {

            Toast.makeText(getBaseContext(), "!!Der Knopf funktioniert!!", Toast.LENGTH_SHORT).show();

        }

        else  Toast.makeText(getBaseContext(), "!!Der Knopf funktioniert immer noch!! Anzahl Klicks: " + anzahl, Toast.LENGTH_SHORT).show();

        anzahl++;
    }





}
