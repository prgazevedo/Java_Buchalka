package com.Section8.Arrays_Lists_Autoboxing.LinkedListChallenge;

import java.util.*;

public class PlayList {
    private AlbumLibrary albumLibrary;
    private LinkedList<Song> playList;
    private PlayListInterface playListInterface;
    private MyIterator<Song> playlistIterator;
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


    public boolean checkPlaylist(){
        return (!playList.isEmpty());
    }

    public String printPlaylist(){
        if(checkPlaylist()){
            return playList.toString();
        }
        return "";
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

    public boolean initialize() {
        if(!playList.isEmpty())
        {
            playlistIterator = new MyIterator<>(playList.listIterator(0));
            return true;
        }
        return false;
    }



    public static class MyIterator<T> {
        private java.util.ListIterator<T> myIterator;
        private static boolean bMovingForward;
        private static boolean bMovingBackward;

        public MyIterator(java.util.ListIterator<T> myIterator) {
            this.myIterator = myIterator;
            //Since we start at 0 we can only go forward
            bMovingForward = true;
            bMovingBackward = false;
        }

        public void setMyIterator(java.util.ListIterator<T> myIterator) {
            this.myIterator = myIterator;
        }

        public boolean hasNext(){
            return myIterator.hasNext();
        }

        public boolean hasPrevious(){
            return myIterator.hasPrevious();
        }

        public T next(){
            bMovingForward=true;
            if(bMovingBackward){
                bMovingBackward=false;
                //must advance one more
                myIterator.next();
            }

            return myIterator.next();
        }

        public  T previous(){
            bMovingBackward=true;
            if(bMovingForward){
                bMovingForward=false;
                myIterator.previous();
            }
            return myIterator.previous();
        }
    }

}
