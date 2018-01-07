package com.example.android.miwok;

/**
 * Created by yarya on 10/29/2017.
 */

public class Word {

    private final int NO_IMAGE_PROVIDED = -1;

    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResourceId = NO_IMAGE_PROVIDED; // resource id of the images to be used aginst the translations

    public Word(String defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, Integer imageResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceId = imageResourceId;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(Integer imageResourceID) {
        this.imageResourceId = imageResourceID;
    }

    public boolean hasImage(){
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
