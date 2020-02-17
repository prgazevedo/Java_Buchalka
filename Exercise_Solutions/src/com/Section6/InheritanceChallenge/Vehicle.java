package com.Section6.InheritanceChallenge;

public class Vehicle {


    public int getSpeed() {
        System.out.println("current speed is:" +speed);
        return speed;
    }

    private void setSpeed(int speed) {
        if(speed>=0) this.speed = speed;
        else this.speed=0;
    }

    private int speed;
    private String name;


    public Vehicle() {
        this(0, "defaultName");
        System.out.println(" Vehicle() called");
    }

    public Vehicle(int speed, String name) {
        this.speed = speed;
        this.name = name;
        System.out.println(" Vehicle(int speed) called");
    }

    public void increaseSpeed(int speedChange){
        setSpeed(this.speed+speedChange);
        System.out.println("Vehicle increaseSpeed called. Speed is now: "+this.getSpeed());

    }
    public void decreaseSpeed(int speedChange){
        setSpeed(this.speed-speedChange);
        System.out.println("Vehicle decreaseSpeed called. Speed is now: "+this.getSpeed());

    }


}
