package com.prgazevedo.timbuchalka.Section6.OOP1_Classes_Constructors_Inheritance.carpetCost;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        if(cost<0) cost=0;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


}
