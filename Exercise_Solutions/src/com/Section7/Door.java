package com.Section7;

public class Door {


    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        System.out.println(this.getClass().toString()+" called: setOpen");
        isOpen = open;
    }

    public Dimension getDoorDimensions() {
        return doorDimensions;
    }

    public void setDoorDimensions(Dimension doorDimensions) {
        this.doorDimensions = doorDimensions;
    }

    private Dimension doorDimensions;
    private boolean isOpen;

    public Door(Dimension doorDimensions, boolean isOpen) {
        this.doorDimensions = doorDimensions;
        this.isOpen = isOpen;
    }
}
