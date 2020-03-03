package com.Section9.Interfaces_Abstract_classes.InterfacesChallenge;

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
    public List readData() {

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.addAll( super.readData());
        stringArrayList.add(this.monsterPower);
        return stringArrayList;
    }

    @Override
    public void writeData(List toWrite) {
        super.writeData(toWrite);
        monsterPower=(String)toWrite.get(2);

    }
}
