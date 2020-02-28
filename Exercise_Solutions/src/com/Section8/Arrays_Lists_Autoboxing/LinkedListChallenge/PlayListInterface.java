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
    }

    public void runPlayListInterface(){
        this.scanner = new Scanner(System.in);
        boolean bExit=true;
        while(bExit){
            bExit=processPlayListOptions();
        }
    }

    private void initializeAlbums(int numberAlbums, int numberSongs){
        NameGenerator NG = new NameGenerator();
        for(int i=0; i<numberAlbums;i++){
            //new album
            String randomAlbumName = NG.generateName();
            playList.createAlbum(randomAlbumName);
            for(int j=0; j<numberSongs;j++) {
                playList.addSongToAlbum(randomAlbumName,NG.generateName());
            }
        }
    }

    private boolean processPlayListOptions() {
        
    }
}
