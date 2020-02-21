package com.Section7.OOP2_Composition_Encapsulation_Polymorphism.Polymorphism;

 class Car {

    private String engine;
    private String name;
    private int wheels;
    private int cilinders;

    public Car(String engine, String name, int wheels, int cilinders) {
        this.engine = engine;
        this.name = name;
        this.wheels = wheels;
        this.cilinders = cilinders;
    }

    public String getEngine() {
        return engine;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCilinders() {
        return cilinders;
    }

    public void startEngine(){
        System.out.println("car engine has started");
    }

    public void accelerate(){
        System.out.println("car is accelerating");
    }

    public void brake(){
        System.out.println("car is braking");
    }


}
 class Ferrari extends Car{

    public Ferrari() {
        super("V12", "Testarossa", 4, 12);
    }

    @Override
    public void startEngine(){
        System.out.println("Ferrari engine has started");
    }
    @Override
    public void accelerate(){
        System.out.println("Ferrari is accelerating");
    }
    @Override
    public void brake(){
        System.out.println("Ferrari is braking");
    }
}

 class Fiat extends Car{

    public Fiat() {
        super("1.4", "Tipo", 4, 4);
    }

    @Override
    public void startEngine(){
        System.out.println("Fiat engine has started");
    }
    @Override
    public void accelerate(){
        System.out.println("Fiat is accelerating");
    }
    @Override
    public void brake(){
        System.out.println("Fiat is braking");
    }
}


public class Main{

    public static void main(String[] args){
        Car ferrari;
        ferrari = new Ferrari();
        ferrari.startEngine();
        ferrari.accelerate();
        ferrari.brake();

        Car fiat;
        fiat = new Fiat();
        fiat.startEngine();
        fiat.accelerate();
        fiat.brake();
    }
}

