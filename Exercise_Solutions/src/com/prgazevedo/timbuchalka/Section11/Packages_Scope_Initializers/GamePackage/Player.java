package com.prgazevedo.timbuchalka.Section11.Packages_Scope_Initializers.GamePackage;

import java.util.ArrayList;
import java.util.List;

public class Player extends GameCharacter implements ISaveable {
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
    public List writeData() {

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.addAll( super.writeData());
        stringArrayList.add(this.playerWeapon);
        return stringArrayList;
    }

    @Override
    public void readData(List toWrite) {
        if(toWrite!=null && toWrite.size()>2){
            super.readData(toWrite);
            playerWeapon=(String)toWrite.get(2);
        }


    }
}
