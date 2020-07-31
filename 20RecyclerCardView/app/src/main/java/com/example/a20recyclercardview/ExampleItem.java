package com.example.a20recyclercardview;

public class ExampleItem {

    //Variable declaration
    private int mImageResource;
    private String mText;

    public ExampleItem(int mImageResource, String mText) {
        this.mImageResource = mImageResource;
        this.mText = mText;
    }

    //Generate getters

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmText() {
        return mText;
    }
}
