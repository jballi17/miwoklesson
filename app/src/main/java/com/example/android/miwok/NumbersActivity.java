package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //  Add code here for Numbers String array
        String [] words = new String[10];

        //  For loop to populate array with english numbers
        for(int i=0;i < words.length;i++){
            words[i]="@string/number_" + (i+1);
        }
        
    }
}
