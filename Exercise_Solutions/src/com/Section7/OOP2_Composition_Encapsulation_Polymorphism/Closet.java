package com.Section7.OOP2_Composition_Encapsulation_Polymorphism;

public class Closet {
    private Dimension closetDimension;
    private Door closetDoor;

    public Closet(Dimension closetDimension, Door closetDoor) {
        this.closetDimension = closetDimension;
        this.closetDoor = closetDoor;
    }

    public Dimension getClosetDimension() {
        return closetDimension;
    }

    public void setClosetDimension(Dimension closetDimension) {
        this.closetDimension = closetDimension;
    }

    public Door getClosetDoor() {
        return closetDoor;
    }

    public void setClosetDoor(Door closetDoor) {
        this.closetDoor = closetDoor;
    }
}
