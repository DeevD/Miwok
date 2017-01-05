package com.example.heinhtet.miwok;

/**
 * Created by heinhtet on 1/4/17.
 */

public class Word {
    private String mDefaultTranslaton;

    private String mMiwokTranslation;


    public Word( String defaultTranslation, String miwokTranslation){
        mDefaultTranslaton = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public String getmDefaultTranslaton() {
        return mDefaultTranslaton;
    }

    public void setmDefaultTranslaton(String mDefaultTranslaton) {
        this.mDefaultTranslaton = mDefaultTranslaton;
    }






}
