package com.Section9.Interfaces_Inner_Anonymous_Abstract_classes.InterfacesChallenge;

import java.util.ArrayList;
import java.util.List;

public class Monster extends GameCharacter implements ISaveable{
    private String monsterPower;

    public Monster( String name, String monsterPower) {
        super(10, name);
        this.monsterPower = monsterPower;
    }

    public String getMonsterPower() {
        return monsterPower;
    }

    public void setMonsterPower(String monsterPower) {
        this.monsterPower = monsterPower;
    }

    @Override
    public String toString() {
        return super.toString()+ "Monster{" +
                "monsterPower='" + monsterPower + '\'' +
                '}';
    }

    @Override
    public List writeData() {

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.addAll( super.writeData());
        stringArrayList.add(this.monsterPower);
        return stringArrayList;
    }

    @Override
    public void readData(List toWrite) {
        if(toWrite!=null && toWrite.size()>2){
            super.readData(toWrite);
            monsterPower=(String)toWrite.get(2);
        }



    }
}
