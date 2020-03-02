package com.Section8.Arrays_Lists_Autoboxing.LinkedListChallenge;

import java.util.*;

public class PlayList {
    private AlbumLibrary albumLibrary;
    private LinkedList<Song> playList;
    private PlayListInterface playListInterface;
    private ListIterator<Song> playlistIterator;
    private Song currentSong;

    public AlbumLibrary getLib() {
        return albumLibrary;
    }

    public PlayList() {
        albumLibrary = new AlbumLibrary();
        playList = new LinkedList<>();
        playListInterface = new PlayListInterface(this);

    }



    public void addSongToPlaylist(Song song){
        System.out.println("add Song To Playlist");
        playList.add(song);
    }

    public void removeSongFromPlaylist(Song song){
        System.out.println("remove Song From Playlist");
        playList.removeFirstOccurrence(song);
    }


    public void addAlbumToPlaylist(Album album){
        System.out.println("add Album To Playlist");
        if(album.getSongArrayList()!=null){
            for (Song s:album.getSongArrayList())
            {
                playList.add(s);
            }
        }

    }

    public void removeAlbumFromPlaylist(Album album){
        System.out.println("remove Album From Playlist");
        if(album.getSongArrayList()!=null){
            for (Song s:album.getSongArrayList())
            {
                playList.removeFirstOccurrence(s);
            }
        }
    }

    public Song getCurrentSong(){
        if(checkPlaylist()) return currentSong;
        else return null;
    }


    private boolean checkPlaylist(){
        if(!playList.isEmpty()){
            return true;
        } else{
            System.out.println("No songs in playlist. Add Songs to playlist");
            return false;
        }
    }

    public void playCurrentSong(){
        if(checkPlaylist()){
            currentSong = playList.getFirst();
            System.out.println("Current Song is: "+ currentSong.getTitle());
        } else{
            System.out.println("No songs in playlist. Add Songs to playlist");
        }
    }



    public void nextSong(){
        if(checkPlaylist()){
            if(playlistIterator.hasNext()){
                currentSong = playlistIterator.next();
                System.out.println("Advanced Song. current Song is now : "+ currentSong.getTitle());
            }
            else{
                System.out.println("At the end of playlist");
            }
        }

    }

    public void previousSong(){
        if(checkPlaylist()){
            if(playlistIterator.hasPrevious()){
                currentSong = playlistIterator.previous();
                System.out.println("Rewind to previous Song. current Song is now : "+ currentSong.getTitle());
            }
            else{
                System.out.println("At the beginning of playlist");
            }
        }

    }

    public void runPlayList() {
        playListInterface.runPlayListInterface();
    }
}
