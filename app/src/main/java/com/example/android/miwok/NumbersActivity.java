package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //  Add code here for Numbers ArrayList<Word>
        ArrayList<Word> words = new ArrayList<Word>();

        //  Populate ArrayList<Word> with english numbers
        words.add(new Word("one", "lutti", R.mipmap.ic_launcher));
        words.add(new Word("two", "otiiko", R.mipmap.ic_launcher));
        words.add(new Word("three", "tolookosu", R.mipmap.ic_launcher));
        words.add(new Word("four", "oyyisa", R.mipmap.ic_launcher));
        words.add(new Word("five", "massokka", R.mipmap.ic_launcher));
        words.add(new Word("six", "temmokka", R.mipmap.ic_launcher));
        words.add(new Word("seven", "kenekaku", R.mipmap.ic_launcher));
        words.add(new Word("eight", "kawinta", R.mipmap.ic_launcher));
        words.add(new Word("nine", "wo'e", R.mipmap.ic_launcher));
        words.add(new Word("ten", "na'aacha", R.mipmap.ic_launcher));

        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
