package com.Section6.OOP1_Classes_Constructors_Inheritance.InheritanceChallenge;

public class Car extends Vehicle {


    public enum Direction{

        L("left"),R("right"),F("front");

        private String action;

        public String getAction(){
            return this.action;
        }
        private Direction(String action) {
            this.action = action;
        }
    }



     public enum Gears{

        R("Reverse"),N("Neutral"),D("Drive"),P("Park"),NEUTRAL("neutral"), FIRST("first gear"),SECOND("second gear"),THIRD("third gear"),FOURTH("fourth gear");


        private String action;

        public String getAction(){
            return this.action;
        }
        private Gears(String action) {

            this.action = action;
        }
     }


    boolean bAutoGear = true;
    private Gears gear;
    private Direction direction;




    public Car() {
        this(0, "default car name", true,  Gears.NEUTRAL, Direction.F);
        System.out.println(" Car() called");
    }


    public Car(int speed, String name, boolean geartype, Gears gear, Direction direction) {
        super(speed, name);
        this.bAutoGear = geartype;
        this.gear = gear;
        this.direction = direction;
        System.out.println(" Car(int speed, String name, GearType geartype, Gears gear, Direction direction) called");
    }




    public Gears getGears() {
        System.out.println("getGears current gear is:" +gear.getAction());
        return gear;
    }

    public void setGears(Gears newgear) {
        System.out.println("setGears current gear is:" +gear.getAction()+ "new gear is"+newgear.getAction());
        this.gear = newgear;
    }


    public Direction getDirection() {
        System.out.println("current direction is:" +direction.getAction());
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    private void changeGears(){

        if(bAutoGear) {
            if(getSpeed()<=0)   setGears(Gears.R);
            else if(getSpeed()==0)   setGears(Gears.P);
            else setGears(Gears.D);
        }
        else{
            if(getSpeed()==0) setGears(Gears.N);
            if(getSpeed()>=0 && getSpeed() <20) setGears(Gears.FIRST);
            else if(getSpeed()>=20 && getSpeed() <40) setGears(Gears.SECOND);
            else if(getSpeed()>=40 && getSpeed() <60) setGears(Gears.THIRD);
            else if(getSpeed()>=60 ) setGears(Gears.FOURTH);
        }
    }

    @Override
    public void increaseSpeed(int speedChange) {
        super.increaseSpeed(speedChange);
        changeGears();
    }

    @Override
    public void decreaseSpeed(int speedChange) {
        super.decreaseSpeed(speedChange);
        changeGears();
    }
}
