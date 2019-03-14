package com.teamedge.android.rottenmemes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.Arrays;

public class MemeAdapter extends ArrayAdapter<Meme> {

    Context context;
    ArrayList<Meme> memeList;

    public MemeAdapter(Context context, ArrayList<Meme> memeList) {
        super(context, 0, memeList);
        System.out.println(memeList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.meme_item, parent,
                false);
        Meme memeItem = getItem(position);
        ImageView memePhoto = convertView.findViewById(R.id.meme_photo);
        memePhoto.setImageResource(memeItem.getMemePhoto());
        TextView memeName = convertView.findViewById(R.id.meme_name);
        memeName.setText("Name:  " + memeItem.getMemeName());
        TextView memeLikes = convertView.findViewById(R.id.meme_likes);
        memeName.setText("Likes:  " + memeItem.getMemeLikes());
        return convertView;
    }
}


