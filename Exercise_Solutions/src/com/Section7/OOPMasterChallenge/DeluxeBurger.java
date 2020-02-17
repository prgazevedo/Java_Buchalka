package com.Section7.OOPMasterChallenge;

public class DeluxeBurger extends BasicBurger {
    DeluxeAdditions addition5;
    DeluxeAdditions addition6;

    public DeluxeBurger(MeatType meat, BreadType bread) {
        super("Deluxe Burger",meat, bread);
        addBasicAdditions();
        this.addition5 = new DeluxeAdditions(DeluxeAdditions.DeluxeAdditionType.Chips);
        this.addition6 = new DeluxeAdditions(DeluxeAdditions.DeluxeAdditionType.Drinks);
        System.out.println("Burger has additions: "+"addition5: "+addition5.toString()+" addition6: "+addition6.toString() );

    }

    @Override
    public void addBasicAdditions(Additions addition1, Additions addition2, Additions addition3, Additions addition4){
        addBasicAdditions();
    }

    private void addBasicAdditions(){
        super.addition1=new Additions(Additions.AdditionType.None);
        super.addition2=new Additions(Additions.AdditionType.None);
        super.addition3=new Additions(Additions.AdditionType.None);
        super.addition4=new Additions(Additions.AdditionType.None);
    }

    public double getDeluxeAdditionsPrice(){
        return addition5.getPrice()+addition6.getPrice();
    }


    public String getListDeluxeAditions(){
        return "Addition 5:" + addition5.toString()+ " " +
                "Addition 6:" + addition6.toString()+ " " ;
    }

    @Override
    public String getListIngredients(){
        return super.getListIngredients()+getListDeluxeAditions();
    }

    @Override
    public double getTotalPrice(){
        return getBasePrice()+ getBasicAdditionsPrice()+getDeluxeAdditionsPrice();
    }
}
