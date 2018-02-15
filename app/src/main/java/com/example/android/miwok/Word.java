package com.example.android.miwok;

/**
 * Created by Josh on 2/14/2018.
 */

public class Word {
    private String defaultWord;
    private String miwokWord;

    public Word(){
        this.defaultWord = "";
        this.miwokWord = "";
    }

    public Word(String defaultWord, String miwokWord){
        this.defaultWord = defaultWord;
        this.miwokWord = miwokWord;
    }

    public String getDefaultTranslation(){
        return this.defaultWord;
    }

    public String getMiwokTranslation(){
        return this.miwokWord;
    }

    public void setDefaultWord(String defaultWord){
        this.defaultWord = defaultWord;
    }

    public void setMiwokWord(String miwokWord){
        this.miwokWord = miwokWord;
    }
}
