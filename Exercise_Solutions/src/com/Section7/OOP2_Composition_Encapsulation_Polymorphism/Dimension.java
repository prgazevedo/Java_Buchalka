package com.Section7.OOP2_Composition_Encapsulation_Polymorphism;

public class Dimension {
    private double height;
    private double width;
    private double depth;
    private double length;

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Dimension(double height, double width) {
        this(height,width,0,0);
    }

    public Dimension(double height, double width, double depth) {
        this(height,width,depth,0);
    }


    public Dimension(double height, double width, double depth, double length) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.length = length;
    }
}
