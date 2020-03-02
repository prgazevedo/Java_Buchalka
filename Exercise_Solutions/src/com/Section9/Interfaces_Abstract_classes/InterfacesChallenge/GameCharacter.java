package com.Section9.Interfaces_Abstract_classes.InterfacesChallenge;

public class GameCharacter {
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

    @Override
    public String toString() {
        return "GameCharacter{" +
                "health=" + health +
                ", name='" + name + '\'' +
                '}';
    }
}
