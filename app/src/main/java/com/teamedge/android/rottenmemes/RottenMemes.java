package com.teamedge.android.rottenmemes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class RottenMemes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotten_memes);

        ArrayList<Meme> memeList = new ArrayList<>();
        memeList.add(new Meme("Forever Alone", R.drawable.foreveralone, 2));
        memeList.add(new Meme("Moto Moto", R.drawable.moto, 25));
        memeList.add(new Meme("Doge", R.drawable.doge, 0));
        memeList.add(new Meme("Y U No!?", R.drawable.yuno, 5));

        MemeAdapter memeAdapter = new MemeAdapter(this, memeList);
        GridView memeGridView = findViewById(R.id.meme_grid_view);
        memeGridView.setNumColumns(2);
        memeGridView.setAdapter(memeAdapter);
    }
}
