package com.Section9.Interfaces_Abstract_classes.InterfacesChallenge;

import java.util.ArrayList;
import java.util.List;

public class Player extends GameCharacter implements ISaveable{
    private String playerWeapon;

    public Player( String name, String playerWeapon) {
        super(20, name);
        this.playerWeapon = playerWeapon;
    }

    public String getPlayerWeapon() {
        return playerWeapon;
    }

    public void setPlayerWeapon(String playerWeapon) {
        this.playerWeapon = playerWeapon;
    }

    @Override
    public String toString() {
        return super.toString()+ "Player{" +
                "playerWeapon='" + playerWeapon + '\'' +
                '}';
    }

    @Override
    public List readData() {

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.addAll( super.readData());
        stringArrayList.add(this.playerWeapon);
        return stringArrayList;
    }

    @Override
    public void writeData(List toWrite) {
        super.writeData(toWrite);
        playerWeapon=(String)toWrite.get(2);

    }
}
