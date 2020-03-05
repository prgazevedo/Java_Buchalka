package com.prgazevedo.timbuchalka.Section7.OOP2_Composition_Encapsulation_Polymorphism.OOPMasterChallenge;

public class Additions {

    public enum AdditionType { None("None"),Lettuce("Lettuce"), Tomato("Tomato"), Carrot("Carrot"), Mustard("Mustard"), Ketchup("Ketchup") , Cucumber("Cucumber"), Cheese("Cheese");
    private String action;

        public String getAction() {
            return action;
        }

        AdditionType(String action) {
            this.action = action;
        }
    }



    private AdditionType additionType;

    @Override
    public String toString(){
        return additionType.getAction();
    }

    public Additions() {
    }

    public Additions(AdditionType additionType) {
        this.additionType = additionType;
    }

    public double getPrice(){
            switch(additionType){
                case Lettuce: return 0.2;
                case Cheese: return 0.3;
                case Cucumber: return 0.3;
                case Tomato: return 0.3;
                case Carrot: return 0.4;
                case Mustard: return 0.4;
                case Ketchup: return 0.4;
                default: return 0;
            }
        }


}
