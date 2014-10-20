package com.example.alex.mymusiclist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by Alex on 10/19/2014.
 */
public class SongAdapter extends ArrayAdapter<Song>{
    private SimpleDateFormat df = new SimpleDateFormat("MMM d, yyyy (EEE)");

    private Context mContext;
    private List<Song> mEntries;


    public SongAdapter(Context context, int textViewResourceId, List<Song> entries) {
        super(context, textViewResourceId, entries);
        mContext = context;
        mEntries= entries;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if(view==null){
            LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.listview_for_each_song, parent, false);
        }
        final Song song = mEntries.get(position);

        TextView textViewTitle = (TextView)view.findViewById(R.id.textViewSongTitle);
        textViewTitle.setText(song.getName());

        TextView textViewArtist = (TextView)view.findViewById(R.id.textViewSongArtist);
        textViewArtist.setText(song.getArtist());

        TextView textViewPublishedDate = (TextView)view.findViewById(R.id.textViewSongDate);
        textViewPublishedDate.setText(df.format(song.getPublishedDate()));

        return view;
    }
}
