package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Josh on 2/16/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //  Check if existing view is in use, else, inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent, false);
        }

        //  Get {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        //  Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView defaultTranslationTextView = (TextView) listItemView.findViewById(
                R.id.default_text_view);

        defaultTranslationTextView.setText(currentWord.getDefaultTranslation());

        //  Find the TextView in the list_item.xml layout with the ID miwok_text_view
        TextView miwokTranslationTextView = (TextView) listItemView.findViewById(
                R.id.miwok_text_view);

        miwokTranslationTextView.setText(currentWord.getMiwokTranslation());

        //  Return the whole list item layout (containing 2 TextViews)
        //  It can be shown in ListView
        return listItemView;
    }
}
