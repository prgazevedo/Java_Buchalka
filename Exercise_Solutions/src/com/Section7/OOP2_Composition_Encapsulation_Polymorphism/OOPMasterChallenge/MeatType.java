package com.Section7.OOP2_Composition_Encapsulation_Polymorphism.OOPMasterChallenge;
public class MeatType{

    public enum MeatVariant{
        Pork("Pork"), Beef("Beef"), Chicken("Chicken");
        private String action;

        public String getAction() {
            return action;
        }

        MeatVariant(String action) {
            this.action = action;
        }
    }

    MeatVariant meatVariant;

    public MeatType() {
        this(MeatVariant.Pork);
    }

    public MeatType(MeatVariant meatVariant) {
        this.meatVariant = meatVariant;
    }

    @Override
    public String toString(){
        return meatVariant.getAction();
    }

    public double getPrice(){
        switch(meatVariant){
            case Beef: return 2.0;
            case Pork: return 2.5;
            case Chicken: return 1.5;
            default: return 0;
        }
    }
}