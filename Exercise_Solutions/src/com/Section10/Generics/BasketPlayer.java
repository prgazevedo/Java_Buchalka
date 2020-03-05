package com.Section10.Generics;

public class BasketPlayer extends Player {
    private int height;

    public BasketPlayer(String name, int age, int height) {
        super(name, age, "Basket");
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
