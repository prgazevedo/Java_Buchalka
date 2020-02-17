package com.Section7.OOPMasterChallenge;

public class BreadType{


    public enum BreadVariant {

        WhiteBread("WhiteBread"), DarkBread("DarkBread"), CornBread("CornBread");
        private String action;

        public String getAction() {
            return action;
        }

        BreadVariant(String action) {
            this.action = action;
        }
    };

    BreadVariant breadVariant;

    public BreadType() {
        this(BreadVariant.WhiteBread);
    }

    public BreadType(BreadVariant breadVariant) {
        this.breadVariant = breadVariant;
    }

    @Override
    public String toString(){
        return breadVariant.getAction();
    }

    public double getPrice(){
        switch(breadVariant){
            case WhiteBread: return 1.0;
            case DarkBread: return 1.5;
            case CornBread: return 2.0;
            default: return 0;
        }
    }
}