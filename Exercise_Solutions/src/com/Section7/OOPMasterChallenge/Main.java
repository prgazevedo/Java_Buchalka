package com.Section7.OOPMasterChallenge;


import com.Section7.OOPMasterChallenge.Additions.*;
import com.Section7.OOPMasterChallenge.BreadType.*;
import com.Section7.OOPMasterChallenge.MeatType.*;

public class Main {

    public static void main(String[] args) {

        BasicBurger basicBurger = new BasicBurger();
        basicBurger.addBasicAdditions(new Additions(AdditionType.Tomato),
                new Additions(AdditionType.Mustard),
                new Additions(AdditionType.Ketchup),
                new Additions(AdditionType.Cheese));
        System.out.println("Price is:"+basicBurger.getTotalPrice());

        DeluxeBurger deluxeBurger = new DeluxeBurger(
                new MeatType(MeatVariant.Beef),
                new BreadType(BreadVariant.CornBread));
        deluxeBurger.addBasicAdditions(new Additions(AdditionType.Tomato),
                new Additions(AdditionType.Mustard),
                new Additions(AdditionType.Ketchup),
                new Additions(AdditionType.Cheese));
        System.out.println("Price is:"+deluxeBurger.getTotalPrice());

        HealthyBurger healthyBurger = new HealthyBurger(
                new MeatType(MeatVariant.Chicken));
        healthyBurger.addBasicAdditions(new Additions(AdditionType.Tomato),
                new Additions(AdditionType.Mustard),
                new Additions(AdditionType.Ketchup),
                new Additions(AdditionType.Cheese));
        healthyBurger.addHealthyAdditions(new Additions(AdditionType.Cucumber),
                new Additions(AdditionType.Carrot));
        System.out.println("Price is:"+String.format("%.1f", healthyBurger.getTotalPrice()));

    }
}
