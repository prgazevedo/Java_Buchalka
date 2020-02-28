package com.Section8.Arrays_Lists_Autoboxing.LinkedListChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class PlayList {
    private ArrayList<Album> albumArrayList;
    private LinkedList<Song> playList;

    public PlayList() {
        albumArrayList = new ArrayList<>();
        playList = new LinkedList<>();
    }


    public void createAlbum(String albumName) {
        albumArrayList.add( new Album(albumName)) ;
    }

    public void addSongToAlbum(String albumName,String songName){
        int index = albumArrayList.indexOf(new Album(albumName));
       if( index !=-1 ){
           Album album = albumArrayList.get(index);
           album.addSong(songName);
       }else {
           System.out.println("album not found");
       }
    }


}
