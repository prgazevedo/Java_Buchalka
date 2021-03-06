package com.prgazevedo.timbuchalka.Section11.Packages_Scope_Initializers.GamePackage;

import java.util.ArrayList;
import java.util.List;

public class GameCharacter implements ISaveable {
    private int health;
    private String name;

    public GameCharacter(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "health=" + health +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public List writeData() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add(name);
        stringArrayList.add(""+health);
        return stringArrayList;
    }

    @Override
    public void readData(List toWrite) {
        this.health = Integer.parseInt( (String) toWrite.get(0));
        this.name = (String)toWrite.get(1);


    }
}
