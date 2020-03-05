package com.prgazevedo.timbuchalka.Section7.OOP2_Composition_Encapsulation_Polymorphism;

public class Room {

    private Dimension roomDimensions;
    private Window theWindow;
    private Door theDoor;

    public Room(Dimension roomDimensions, Window theWindow, Door theDoor) {
        this.roomDimensions = roomDimensions;
        this.theWindow = theWindow;
        this.theDoor = theDoor;
    }

    public Dimension getRoomDimensions() {
        return roomDimensions;
    }

    public void setRoomDimensions(Dimension roomDimensions) {
        this.roomDimensions = roomDimensions;
    }

    public Window getTheWindow() {
        return theWindow;
    }

    public void setTheWindow(Window theWindow) {
        this.theWindow = theWindow;
    }

    public Door getTheDoor() {
        return theDoor;
    }

    public void setTheDoor(Door theDoor) {
        this.theDoor = theDoor;
    }
}
