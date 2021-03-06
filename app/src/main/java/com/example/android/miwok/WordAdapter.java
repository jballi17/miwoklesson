package com.example.android.miwok;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Josh on 2/16/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word> words, int textBackgroundColor){
        super(context, 0, words);
        setTextBackgroundColor(textBackgroundColor);
    }

    private int mTextBackgroundColor;

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

        //  Find the ImageView in the list_item.xml layout with the ID default_image_view
        ImageView defaultImageView = (ImageView) listItemView.findViewById(
                R.id.default_image_view);

        if(currentWord.hasImage()) {
            defaultImageView.setImageResource(currentWord.getImageResourceID());
            defaultImageView.setVisibility(View.VISIBLE);
        } else {
            defaultImageView.setVisibility(View.GONE);
        }

        //  Tests for Text Background Color
        if(mTextBackgroundColor >= 0){
            defaultTranslationTextView.setBackgroundResource(mTextBackgroundColor);
            miwokTranslationTextView.setBackgroundResource(mTextBackgroundColor);
        }
        //  Return the whole list item layout (containing 2 TextViews)
        //  It can be shown in ListView

        return listItemView;
    }

    //  Sets the background color of the TextView objects in adapter set
    public void setTextBackgroundColor(int backgroundColor){
        this.mTextBackgroundColor = backgroundColor;
    }
}
