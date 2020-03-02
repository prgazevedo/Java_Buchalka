package com.Section9.Interfaces_Abstract_classes.InterfacesChallenge;

import java.util.ArrayList;
import java.util.List;

public class Monsters implements ISaveable{
    private ArrayList<GameCharacter> arrayListMonsters;

    public Monsters() {
        this.arrayListMonsters = new ArrayList<>();
    }

    public void addMonster(GameCharacter monster){
        arrayListMonsters.add(monster);
    }

    @Override
    public String toString() {
        return "Monsters{" +
                "arrayListMonsters=" + arrayListMonsters +
                '}';
    }

    @Override
    public List readData() {
        return arrayListMonsters;
    }

    @Override
    public void writeData(List toWrite) {
        arrayListMonsters.addAll(toWrite);

    }
}
