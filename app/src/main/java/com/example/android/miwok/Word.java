package com.example.android.miwok;

import java.lang.reflect.Constructor;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    //Default translation for the word
    private String mDeafaultTranslation;

    //Miwok translation for the word
    private String mMiwokTranslation;

    //Store image resource id to associate icon with word
    private int mImageResourceId;

    /**
     * Constructor which takes in two string parameters
     * @param defaultTranslation is the word in a English language
     * @param miwokTranslation is the word in Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDeafaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Constructor which takes in two string parameters and one image resource id
     * @param defaultTranslation is the word in a English language
     * @param miwokTranslation is the word in Miwok language
     * @param imageResourceID is the drawable resource id of the image associated with the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID) {
        mDeafaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceID;
    }

    /**
     * Get the default translation of the word
     */
    public String getDefaultTranslation() {
        return mDeafaultTranslation;
    }

    /**
     * Get the Miwok translation of the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the image resource id of the word
     */
    public int getImageResourceID() {
        return mImageResourceId;
    }
}
