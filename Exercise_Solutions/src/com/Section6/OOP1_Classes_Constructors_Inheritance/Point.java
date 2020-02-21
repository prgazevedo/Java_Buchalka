package com.Section6.OOP1_Classes_Constructors_Inheritance;

public class Point {

    public Point() {
        this(0,0);
    }

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return distance(new Point(0,0));
    }

    public double distance(int x, int y){
        return distance(new Point(x,y));
    }

    public double distance(Point point){
        return  java.lang.Math.sqrt((this.getX()-point.getX())*(this.getX()-point.getX())+((this.getY()-point.getY())*(this.getY()-point.getY())));

        //return  distance_calculation(this.getX(),point.getX(),this.getY(),point.getY());
    }
/*
    private static double distance_calculation(int xA, int xB, int yA, int yB){
        return java.lang.Math.sqrt(((xB-xA)*(xB-xA)+(yB-yA)*(yB-yA)));
    }
*/
}
