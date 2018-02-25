package com.example.android.miwok;

/**  Word class holds the translation of both the default language of the user and the miwok
 *   translation
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mAudioResourceID;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    //  Creates Word object
    //  Pre: (String, String)
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mAudioResourceID = audioResourceID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID,
                int audioResourceID){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceID = imageResourceID;
        this.mAudioResourceID = audioResourceID;
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

    // Returns audio resource ID
    // Returns int
    public int getAudioResourceID() { return this.mAudioResourceID; }

    //  Returns ResourceID
    //  Returns int
    public int getImageResourceID(){
        return this.mImageResourceID;
    }

    //  Returns true if Word object has image associated with it
    //  returns boolean
    public boolean hasImage(){
        return this.mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
