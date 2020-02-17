package com.Section7.OOPMasterChallenge;

public class BasicBurger {

    private String name;
    private MeatType meat;
    private BreadType bread;
    protected Additions addition1;
    protected Additions addition2;
    protected Additions addition3;
    protected Additions addition4;

    public MeatType getMeat() {
        return meat;
    }

    public void setMeat(MeatType meat) {
        this.meat = meat;
        System.out.println("Changed meat to:"+ meat.toString());
    }

    public BreadType getBread() {
        return bread;
    }

    public void setBread(BreadType bread) {
        this.bread = bread;
        System.out.println("Changed bread to:"+ bread.toString());
    }

    public BasicBurger(){
        this("Basic Burger");
    }

    public BasicBurger(String name) {
        this.name=name;
        this.meat= new MeatType();
        this.bread = new BreadType();
        System.out.println("Created  a "+name+ " with: "+"Meat: "+meat.toString()+" Bread: "+bread.toString() );
    }

    public BasicBurger(String name, MeatType meat, BreadType breadType) {
        this.name=name;
        this.meat = meat;
        this.bread = breadType;
        System.out.println("Created a "+name+ " with: "+"Meat: "+meat.toString()+" Bread: "+bread.toString() );

    }

    public double getBasePrice() {
        return meat.getPrice()+bread.getPrice();

    }

    public void addBasicAdditions(Additions addition1, Additions addition2, Additions addition3, Additions addition4){
        this.addition1=addition1;
        this.addition2=addition2;
        this.addition3=addition3;
        this.addition4=addition4;
        System.out.println("Added basic additions: "+addition1.toString()+ ","+
                addition2.toString()+ ","+
                addition3.toString()+ ","+
                addition4.toString()+ ",");
    }

    public double getBasicAdditionsPrice() {
        return addition1.getPrice()+addition2.getPrice()+addition3.getPrice()+addition4.getPrice();
    }

    public double getTotalPrice(){
        return getBasePrice()+ getBasicAdditionsPrice();
    }

    public String getListBasicIngredients() {
        return "Meat:" + meat.meatVariant.toString()+ " " +
                "Bread:" + bread.breadVariant.toString()+ " ";
    }

    public String getListAditions(){
        return "Addition 1:" + addition1.toString()+ " " +
                "Addition 2:" + addition2.toString()+ " " +
                "Addition 3:" + addition3.toString()+ " " +
                "Addition 4:" + addition4.toString() + " ";
    }

    public String getListIngredients(){
        return getListBasicIngredients()+ getListAditions();
    }






}
