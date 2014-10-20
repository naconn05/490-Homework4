package com.example.alex.mymusiclist;

/**
 * Created by Alex on 10/19/2014.
 */

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MyMusicListService {
    private List<Song> songs;

    {
        songs = new ArrayList<Song>();
        songs.add(new Song("I'm Yours", "Jason Mraz","We Sing, We Dance, We Steal Things", getDate(2008,5,15)));
        songs.add(new Song("It's You", "Kem","Promis to Love", getDate(2014,8,25)));
        songs.add(new Song("U Got It Bad", "Usher","8701", getDate(2001,12,18)));
        songs.add(new Song("Anytime", "Brian McKnight","Anytime", getDate(1997,9,23)));
        songs.add(new Song("Rather Be", "Clean Bandit","New Eyes", getDate(2014,1,17)));
        songs.add(new Song("Trumpets", "Jason Derulo","Tattoos", getDate(2013,11,7)));
        songs.add(new Song("Burnin' It Down", "Jason Aldean","Old Boots, New Dirt", getDate(2014,7,22)));
        songs.add(new Song("Animal", "Maroon 5","V", getDate(2014,8,22)));
        songs.add(new Song("All of Me", "John Legend","Love in the Future", getDate(2013,8,12)));
        songs.add(new Song("Ready Set Roll", "Chase Rice","Ready Set Roll", getDate(2013,11,11)));
    }

    public List<Song>findAll(){
        return songs;
    }

    public Song findOne(String name){
        for(Song song:songs){
            if (song.getName().equalsIgnoreCase(name)){
                return song;
            }
        }
        return new Song();
    }

    private static Date getDate(int year, int month, int day){
        Calendar c = Calendar.getInstance();
        c.set(year, month, day);
        return c.getTime();
    }
}
