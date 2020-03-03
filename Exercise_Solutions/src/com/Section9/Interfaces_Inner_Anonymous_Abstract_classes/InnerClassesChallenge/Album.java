package com.Section9.Interfaces_Inner_Anonymous_Abstract_classes.InnerClassesChallenge;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Reused from TimBuchalka code
 * Created by dev on 18/09/15.
 */
public class Album {
    private String name;
    private String artist;
    //private ArrayList<Song> songs;
    private Songlist songlist;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        //this.songs = new ArrayList<Song>();
        songlist = new Songlist();
    }

    public boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
            this.songlist.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        return songlist.findSong(title);

    }

    private Song findSong(int tracknumber){
        return songlist.findSong(tracknumber);
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = findSong(trackNumber);
        if (checkedSong!=null)
        {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }


    private class Songlist {
        private ArrayList<Song> songArrayList;

        public Songlist(ArrayList<Song> songArrayList) {
            this.songArrayList = songArrayList;
        }

        public Songlist() {
            songArrayList = new ArrayList<>();
        }

        public void add(Song songToAdd){
            songArrayList.add(songToAdd);
        }

        public Song findSong(String title) {
            for (Song s :songArrayList){
                if(s.getTitle().equals(title)) return s;
            }
            return null;
        }

        public Song findSong(int tracknumber){
            int index = tracknumber -1;
            if(tracknumber>=0 && tracknumber<songArrayList.size()){
                return songArrayList.get(index);
            }
            return null;
        }

    }
}
