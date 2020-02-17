package com.Section6.InheritanceChallenge;

public class PoliceCar extends Car {
    private boolean siren;



    public PoliceCar() {
        this.siren = false;
        System.out.println(" PoliceCar() called");
    }

    public PoliceCar(int speed, String name, boolean gearType, Gears gear, Direction direction, boolean siren) {
        super(speed, name, gearType, gear, direction);
        this.siren = siren;
    }

    public boolean isSiren() {
        System.out.println("siren is:"+ ((siren==true)?"ON":"OFF")  );
        return siren;
    }

    public void setSiren(boolean siren) {
        this.siren = siren;
    }
}
