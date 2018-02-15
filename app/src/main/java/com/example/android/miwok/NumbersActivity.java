package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //  Add code here for Numbers ArrayList<String>
        ArrayList<String> words = new ArrayList<String>();

        //  Populate ArrayList<String> with english numbers from string.xml
        words.add(getString(R.string.numbers_one));
        words.add(getString(R.string.numbers_two));
        words.add(getString(R.string.numbers_three));
        words.add(getString(R.string.numbers_four));
        words.add(getString(R.string.numbers_five));
        words.add(getString(R.string.numbers_six));
        words.add(getString(R.string.numbers_seven));
        words.add(getString(R.string.numbers_eight));
        words.add(getString(R.string.numbers_nine));
        words.add(getString(R.string.numbers_ten));

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
