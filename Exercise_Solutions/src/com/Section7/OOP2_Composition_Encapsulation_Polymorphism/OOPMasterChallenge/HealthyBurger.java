package com.Section7.OOP2_Composition_Encapsulation_Polymorphism.OOPMasterChallenge;

import com.Section7.OOP2_Composition_Encapsulation_Polymorphism.OOPMasterChallenge.BreadType.*;


public class HealthyBurger extends BasicBurger{
    private Additions addition5;
    private Additions addition6;

    public HealthyBurger(MeatType meat) {
        super("Healthy Burger");
        super.setMeat(meat);
        super.setBread(new BreadType(BreadVariant.DarkBread));

    }

    @Override
    public void addBasicAdditions(Additions addition1, Additions addition2, Additions addition3, Additions addition4) {
        super.addBasicAdditions(addition1, addition2, addition3, addition4);
    }

    public void addHealthyAdditions(Additions addition5, Additions addition6){
        this.addition5=addition5;
        this.addition6=addition6;
        System.out.println("Added healthy additions: "+getListHealthyAditions());
    }

    private String getListHealthyAditions(){
        return "Addition 5:" + addition5.toString()+ " " +
                "Addition 6:" + addition6.toString()+ " " ;
    }

    @Override
    public String getListIngredients(){
        return super.getListIngredients()+getListHealthyAditions();
    }

    private double getHealthyAdditionsPrice(){
        return addition5.getPrice()+addition6.getPrice();
    }

    @Override
    public double getTotalPrice(){
        return super.getTotalPrice()+getHealthyAdditionsPrice();
    }
}
