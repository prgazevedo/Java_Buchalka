package com.prgazevedo.timbuchalka.Section8.Arrays_Lists_Autoboxing_SortingAlgorithms.LinkedListChallenge;

import java.util.ArrayList;

public class AlbumLibrary {

    private ArrayList<Album> albumArrayList;
    private ArrayList<Song> songArrayList;

    public AlbumLibrary(ArrayList<Album> albumArrayList) {
        this.albumArrayList = albumArrayList;
        for (Album a:albumArrayList)
        {
            songArrayList.addAll( a.getSongArrayList() );
        }

    }

    public AlbumLibrary() {
        this.albumArrayList = new ArrayList<>();
        songArrayList = new ArrayList<>();
    }


    public void createAlbum(String albumName) {
        albumArrayList.add( new Album(albumName)) ;
    }

    public void addSongToAlbum(String albumName,String songName){
        int index = albumArrayList.indexOf(new Album(albumName));
        if( index !=-1 ){
            Album album = albumArrayList.get(index);
            album.addSong(songName);
            songArrayList.add(new Song(songName));
        }else {
            System.out.println("album not found");
        }
    }

    public Song getSong(String songName){
        if(checkAlbumArrayList()){
           int index = songArrayList.indexOf(new Song(songName));
           if(index!=-1){
               return songArrayList.get(index);
           }
        }
        return null;

    }

    private boolean checkAlbumArrayList(){
        if(!albumArrayList.isEmpty()){
            return true;
        } else {
            System.out.println("Album library is empty");
            return false;
        }
    }

    public String listAlbumsAndSongs() {
        return albumArrayList.toString();
    }
}
