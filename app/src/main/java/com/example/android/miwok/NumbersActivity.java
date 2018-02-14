package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //  Add code here for Numbers String array
        String[] words = new String[10];

        //  For loop to populate array with english numbers
        words[0]=getString(R.string.numbers_one);
        words[1]=getString(R.string.numbers_two);
        words[2]=getString(R.string.numbers_three);
        words[3]=getString(R.string.numbers_four);
        words[4]=getString(R.string.numbers_five);
        words[5]=getString(R.string.numbers_six);
        words[6]=getString(R.string.numbers_seven);
        words[7]=getString(R.string.numbers_eight);
        words[8]=getString(R.string.numbers_nine);
        words[9]=getString(R.string.numbers_ten);
        Log.v("NumbersActivity","Value at index [0]: " + words[0]);
        Log.v("NumbersActivity","Value at index [1]: " + words[1]);
        Log.v("NumbersActivity","Value at index [2]: " + words[2]);
        Log.v("NumbersActivity","Value at index [3]: " + words[3]);
        Log.v("NumbersActivity","Value at index [4]: " + words[4]);
        Log.v("NumbersActivity","Value at index [5]: " + words[5]);
        Log.v("NumbersActivity","Value at index [6]: " + words[6]);
        Log.v("NumbersActivity","Value at index [7]: " + words[7]);
        Log.v("NumbersActivity","Value at index [8]: " + words[8]);
        Log.v("NumbersActivity","Value at index [9]: " + words[9]);

    }
}
