package com.Section7;

public class NightLamp {
    private boolean isOn;
    private String lightColor;

    public NightLamp( String lightColor) {
        this.isOn = false;
        this.lightColor = lightColor;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        System.out.println(this.getClass().toString()+" called: setOn");
        isOn = on;
    }
}
