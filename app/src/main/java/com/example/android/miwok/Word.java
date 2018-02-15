package com.example.android.miwok;

/**  Word class holds the translation of both the default language of the user and the miwok
 *   translation
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    //  Creates Word object
    //  Pre: (String, String)
    public Word(String defaultTranslation, String miwokTranslation){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
    }

    //  Returns default translation of word
    //  Returns String
    public String getDefaultTranslation(){
        return this.mDefaultTranslation;
    }

    //  Returns miwok translation of word
    //  Returns String
    public String getMiwokTranslation(){
        return this.mMiwokTranslation;
    }
}
