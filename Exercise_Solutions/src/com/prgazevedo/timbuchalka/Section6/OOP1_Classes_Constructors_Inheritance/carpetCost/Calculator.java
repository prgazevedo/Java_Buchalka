package com.prgazevedo.timbuchalka.Section6.OOP1_Classes_Constructors_Inheritance.carpetCost;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea()*carpet.getCost();
    }
}
