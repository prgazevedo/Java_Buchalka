package com.Section8.Arrays_Lists_Autoboxing.LinkedListChallenge;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Album {
    String title;
    ArrayList<Song> songArrayList;

    public Album(String title) {
        this.title = title;
        this.songArrayList = new ArrayList<>();
    }

    public void addSong(String songName){
        Random r = new Random();
        double randomValue = (5.0) * r.nextDouble();
        songArrayList.add(new Song(songName, randomValue));
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
