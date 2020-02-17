package com.Section7;

public class Bedroom extends Room {

    private Bed bed;
    private NightLamp lamp;
    private Closet closet;

    public Bedroom(Dimension roomDimensions, Window theWindow, Door theDoor, Bed bed, NightLamp lamp, Closet closet) {
        super(roomDimensions, theWindow, theDoor);
        this.bed = bed;
        this.lamp = lamp;
        this.closet = closet;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public NightLamp getLamp() {
        return lamp;
    }

    public void setLamp(NightLamp lamp) {
        this.lamp = lamp;
    }

    public Closet getCloset() {
        return closet;
    }

    public void setCloset(Closet closet) {
        this.closet = closet;
    }
}
