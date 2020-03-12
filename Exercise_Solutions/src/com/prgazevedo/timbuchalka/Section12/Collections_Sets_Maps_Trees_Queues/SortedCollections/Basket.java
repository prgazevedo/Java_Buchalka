package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.SortedCollections;

import java.util.*;

public class Basket {
    private final String name;
    private Map<StockItem,Integer> basketList;

    public Basket(String name) {
        this.name = name;
        this.basketList = new TreeMap<>();
    }

    public Basket(String name, Map<StockItem, Integer> basketList) {
        this.name = name;
        this.basketList = basketList;
    }


    public int checkInBasket(StockItem stockItem){
        if(stockItem!=null ){
            return basketList.getOrDefault(stockItem,0);
        } else return 0;
    }

    /**
     * Remove the item quantity from the basket
     * @param stockItem
     * @param quantity
     * @return Returns the remaining stock in basket
     */
    public int removeFromBasket(StockItem stockItem, int quantity){
        int currentQuantity=0;
        if((currentQuantity=checkInBasket(stockItem))>0){
            int remainingQuantity=currentQuantity-quantity;
            if(remainingQuantity==0){
                basketList.remove(stockItem);
            } else if(remainingQuantity>0){
                basketList.put(stockItem,remainingQuantity);
            } else if(remainingQuantity<0){
                System.out.println("Cannot remove from basket more that was reserved --> Did not remove item from basket");
            }
            return remainingQuantity;
        }
        System.out.println("Not in basket to remove");
        return 0;
    }

    public int addToBasket(StockItem stockItem, int quantity){
        int currentQuantity=0;
        if((currentQuantity=checkInBasket(stockItem))>=0){
            basketList.put(stockItem,quantity+currentQuantity);
            return currentQuantity;
        } else System.out.println("Not added to basket");
        return 0;
    }

    public Basket checkoutBasket() throws CloneNotSupportedException {
        //we will make a deep copy to return an history of the purchase.
        Map<StockItem,Integer> tempBasketList = new TreeMap<>();

        //Since we need to remove entries from the Map we need to use an iterator
        Iterator<Map.Entry<StockItem,Integer>> iter = basketList.entrySet().iterator();
        //for (StockItem si:basket.keySet()){
        while(iter.hasNext()){
            Map.Entry<StockItem,Integer> entry = iter.next();
            StockItem si = entry.getKey();
            int reservedQTY = si.getReservedQuantity();
            if(si.adjustStock(-reservedQTY)){
                if (si.setReservedQuantity(-reservedQTY)){
                    System.out.println("Item: "+si.getName()+" checkout successful");
                    tempBasketList.put(si.clone(),entry.getValue());
                    iter.remove();
                } else{
                    System.out.println("Could not complete checkout basket. Reserved quantity not correct. ");
                }
            } else{
                System.out.println("Could not checkout basket. Not enough stock for item: "+si.getName()+" with stock quantity: "+si.getQuantity()+" and basket quantity: "+entry.getValue());
            }
        }

        Basket tempBasket = new Basket(this.name,tempBasketList);
        System.out.println("Checkout basket completed");
        return tempBasket;

    }
/**
* Notice that it is only the collection that is unmodifiable
 * The caller can still change the individual elements
 */
    public Map<StockItem,Integer> Items(){
        return Collections.unmodifiableMap(basketList);
    }

    @Override
    public String toString() {
        String toReturn = "Shopping basket: "+this.name +" has "+ basketList.size() + " items \n";
        double totalBasketValue = 0;
        for (StockItem si: basketList.keySet()){
            toReturn+=("Item:"+si.getName()+" Price:"+si.getPrice()+" Quantity:"+(basketList.get(si))+"\n");
            totalBasketValue+= si.getPrice()*si.getQuantity();
        }
        toReturn+=("Total basket value:"+String.format("%1$.1f",totalBasketValue));
        return toReturn;
    }
}
