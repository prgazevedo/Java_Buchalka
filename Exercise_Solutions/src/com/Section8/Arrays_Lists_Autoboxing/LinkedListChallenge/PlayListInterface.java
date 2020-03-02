package com.Section8.Arrays_Lists_Autoboxing.LinkedListChallenge;

import com.Section8.Arrays_Lists_Autoboxing.AutoboxingChallenge.Bank;

import java.util.Scanner;

public class PlayListInterface {


    private static Scanner scanner;
    private PlayList playList;

    public PlayListInterface(PlayList playList) {
        this.playList = playList;
        System.out.println("PlayList Interface started:");
        initializeAlbums(5,10);
        this.scanner = new Scanner(System.in);
    }

    public void runPlayListInterface(){
        boolean bExit=true;
        while(bExit){
            presentPlayListOptions();
            bExit=processPlayListOptions();
        }
    }

    private void presentPlayListOptions() {
        System.out.println("PlayList options:");
        System.out.println("1-List Albums and Songs");
        System.out.println("2-Add Song to PlayList");
        System.out.println("3-Remove Song from PlayList");
        System.out.println("4-Enter Play Mode");
        System.out.println("5-List Options again");
        System.out.println("6-Exit");
    }

    private void runPlayModeInterface(){
        boolean bExit=true;
        while(bExit){
            presentPlayModeOptions();
            bExit=processPlayModeOptions();
        }
    }

    private void presentPlayModeOptions() {
        System.out.println("PlayMode options:");
        System.out.println("1-Play");
        System.out.println("2-Next");
        System.out.println("3-Previous");
        System.out.println("4-Replay");
        System.out.println("5-List PlayList songs");
        System.out.println("6-Exit");
    }

    private void initializeAlbums(int numberAlbums, int numberSongs){
        NameGenerator NG = new NameGenerator();
        for(int i=0; i<numberAlbums;i++){
            //new album
            String randomAlbumName = NG.generateName();
            playList.getLib().createAlbum(randomAlbumName);
            for(int j=0; j<numberSongs;j++) {
                playList.getLib().addSongToAlbum(randomAlbumName,NG.generateName());
            }
        }
    }

    private boolean processPlayModeOptions() {
        System.out.println("Enter option:");
        if(scanner.hasNextInt()){
            int input = scanner.nextInt();
            switch(input){
                case 1:
                    System.out.println("Selected 1-Play");
                    playList.playCurrentSong();
                    return true;
                case 2:
                    System.out.println("Selected 2-Next");
                    playList.nextSong();
                    return true;
                case 3:
                    System.out.println("Selected 3-Previous");
                    playList.previousSong();
                    return true;
                case 4:
                    System.out.println("Selected 4-Replay");
                    playList.getCurrentSong();
                    return true;
                case 5:
                    System.out.println("Selected 5-List PlayList songs");
                    System.out.println("Playlist songs:"+playList.printPlaylist());
                    return true;
                case 6:
                    System.out.println("Selected 6-Exit");
                    return false;
                    default:
                        return false;
            }
        }
        else{
            System.out.println("Not an option!");
            return true;
        }

    }

    private boolean processPlayListOptions() {
        System.out.println("Enter option:");
        if(scanner.hasNextInt()){
            int input = scanner.nextInt();
            switch(input){
                case 1:
                    System.out.println("Selected 1-List Albums and Songs");
                    System.out.println(playList.getLib().listAlbumsAndSongs());
                    return true;
                case 2:
                    System.out.println("Selected 2-Add Song to PlayList");
                    String songNametoAdd = getSongName();
                    Song songToAdd = null;
                    if(songNametoAdd!=null){
                        System.out.println("Song name is: "+songNametoAdd);
                        songToAdd =  playList.getLib().getSong(songNametoAdd);
                    }else{
                        System.out.println("Song Name not valid");
                        return true;
                    }
                    if(songToAdd!=null){
                        System.out.println("Song data is: "+songToAdd.toString());
                        playList.addSongToPlaylist(songToAdd);
                    }
                    else{
                        System.out.println("Song not found");
                    }

                    return true;
                case 3:
                    System.out.println("Selected 3-Remove Song from PlayList");
                    String songNametoRemove = getSongName();
                    Song songToRemove = null;
                    if(songNametoRemove!=null){
                        System.out.println("Song name is: "+songNametoRemove);
                        songToRemove =  playList.getLib().getSong(songNametoRemove);
                    }else{
                        System.out.println("Song Name not valid");
                        return true;
                    }

                    if(songToRemove!=null) {
                        System.out.println("Song data is: " + songToRemove.toString());
                        playList.removeSongFromPlaylist(songToRemove);
                    }
                    else{
                        System.out.println("Song not found");
                    }
                    return true;
                case 4:
                    System.out.println("Selected 4-Enter Play Mode");
                    if(playList.checkPlaylist()){
                        playList.initialize();
                        runPlayModeInterface();
                    }
                    else{
                        System.out.println("No songs in playlist. Add Songs to playlist");
                    }
                     return true;
                case 5:
                    System.out.println("Selected 5-List Options again");
                    return true;
                case 6:

                    System.out.println("Selected 6-Exit");
                    return false;
                default:
                    return false;
            }
        }
        else{
            System.out.println("Not an option!");
            return true;
        }
    }



    private String getSongName(){
        System.out.println("Enter Song name:");
        scanner.nextLine();
        String songName = scanner.nextLine();
        return songName;
    }
}
