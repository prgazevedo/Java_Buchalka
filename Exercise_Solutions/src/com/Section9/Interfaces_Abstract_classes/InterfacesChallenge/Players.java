package com.Section9.Interfaces_Abstract_classes.InterfacesChallenge;

import java.util.ArrayList;
import java.util.List;

public class Players implements ISaveable{
    private ArrayList<GameCharacter> playerArrayList;

    public Players() {
        this.playerArrayList= new ArrayList<>();
    }

    public void addPlayer(GameCharacter player){
        playerArrayList.add(player);
    }

    @Override
    public String toString() {
        return "Players{" +
                "characterArrayList=" +  +
                '}';
    }

    @Override
    public List readData() {
        return playerArrayList;
    }

    @Override
    public void writeData(List toWrite) {
        playerArrayList.addAll(toWrite);
    }
}
