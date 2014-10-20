package com.example.alex.mymusiclist;

/**
 * Created by Alex on 10/19/2014.
 */

import java.util.Date;

public class Song {
    private String name;
    private String artist;
    private String album;
    private Date publishedDate;

    public Song(){
        this.name = "";
        this.artist = "";
        this.album = "";
        this.publishedDate = new Date();
    }

    public Song(String name, String artist, String album, Date publishedDate) {
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.publishedDate = publishedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }
}
