package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    //Default translation for the word
    private String mDeafaultTranslation;

    //Miwok translation for the word
    private String mMiwokTranslation;

    //Constructor which takes in two string parameters
    public Word(String defaultTranslation, String miwokTranslation){
        mDeafaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of the word
     */
    public String getDefaultTranslation(){
        return mDeafaultTranslation;
    }

    /**
     * Get the Miwok translation of the word
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
