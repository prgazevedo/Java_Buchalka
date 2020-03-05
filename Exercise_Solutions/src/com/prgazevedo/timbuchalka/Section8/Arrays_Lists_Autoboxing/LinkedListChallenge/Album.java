package com.prgazevedo.timbuchalka.Section8.Arrays_Lists_Autoboxing.LinkedListChallenge;

import java.util.ArrayList;
import java.util.Objects;

public class Album {
    String title;
    ArrayList<Song> songArrayList;

    public ArrayList<Song> getSongArrayList() {
        return songArrayList;
    }

    public Album(String title) {
        this.title = title;
        this.songArrayList = new ArrayList<>();
    }


    public Song getSong(String songName){
       int index =  songArrayList.indexOf(new Song(songName));
       if(index!=-1){
           return songArrayList.get(index);
       }
       else return null;
    }

    public void addSong(String songName){
        songArrayList.add(new Song(songName));
    }

    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", songArrayList=" + songArrayList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(title, album.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
