package com.teamedge.android.rottenmemes;

public class Meme {

    String memeName;
    int memePhoto;
    int memeLikes;

    public Meme(String memeName, int memePhoto, int memeLikes) {
        this.memeName = memeName;
        this.memePhoto = memePhoto;
        this.memeLikes = memeLikes;
    }

    public String getMemeName() {
        return memeName;
    }

    public int getMemePhoto() {
        return memePhoto;
    }

    public String getMemeLikes() {
        return Integer.toString(memeLikes);
    }
}