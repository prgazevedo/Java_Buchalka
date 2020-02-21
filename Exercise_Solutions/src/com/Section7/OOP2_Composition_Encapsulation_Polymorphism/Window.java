package com.Section7.OOP2_Composition_Encapsulation_Polymorphism;

public class Window {
    private Dimension windowDimensions;
    private boolean isOpen;

    public Dimension getWindowDimensions() {
        return windowDimensions;
    }

    public void setWindowDimensions(Dimension windowDimensions) {
        this.windowDimensions = windowDimensions;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        System.out.println(this.getClass().toString()+" called: setOpen");
        isOpen = open;
    }

    public Window(Dimension windowDimensions, boolean isOpen) {
        this.windowDimensions = windowDimensions;
        this.isOpen = isOpen;
    }
}
