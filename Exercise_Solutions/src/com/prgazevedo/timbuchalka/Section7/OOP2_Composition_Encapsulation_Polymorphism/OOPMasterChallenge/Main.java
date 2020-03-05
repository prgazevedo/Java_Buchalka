package com.prgazevedo.timbuchalka.Section7.OOP2_Composition_Encapsulation_Polymorphism.OOPMasterChallenge;


public class Main {

    public static void main(String[] args) {

        BasicBurger basicBurger = new BasicBurger();
        basicBurger.addBasicAdditions(new Additions(Additions.AdditionType.Tomato),
                new Additions(Additions.AdditionType.Mustard),
                new Additions(Additions.AdditionType.Ketchup),
                new Additions(Additions.AdditionType.Cheese));
        System.out.println("Price is:"+basicBurger.getTotalPrice());

        DeluxeBurger deluxeBurger = new DeluxeBurger(
                new MeatType(MeatType.MeatVariant.Beef),
                new BreadType(BreadType.BreadVariant.CornBread));
        deluxeBurger.addBasicAdditions(new Additions(Additions.AdditionType.Tomato),
                new Additions(Additions.AdditionType.Mustard),
                new Additions(Additions.AdditionType.Ketchup),
                new Additions(Additions.AdditionType.Cheese));
        System.out.println("Price is:"+deluxeBurger.getTotalPrice());

        HealthyBurger healthyBurger = new HealthyBurger(
                new MeatType(MeatType.MeatVariant.Chicken));
        healthyBurger.addBasicAdditions(new Additions(Additions.AdditionType.Tomato),
                new Additions(Additions.AdditionType.Mustard),
                new Additions(Additions.AdditionType.Ketchup),
                new Additions(Additions.AdditionType.Cheese));
        healthyBurger.addHealthyAdditions(new Additions(Additions.AdditionType.Cucumber),
                new Additions(Additions.AdditionType.Carrot));
        System.out.println("Price is:"+String.format("%.1f", healthyBurger.getTotalPrice()));

    }
}
