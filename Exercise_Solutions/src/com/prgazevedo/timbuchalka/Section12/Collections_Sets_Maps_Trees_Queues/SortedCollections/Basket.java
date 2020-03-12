package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.SortedCollections;

import java.util.*;

public class Basket {
    private final String name;
    private Map<StockItem,Integer> basket;

    public Basket(String name) {
        this.name = name;
        this.basket = new TreeMap<>();
    }

    public int addToBasket(StockItem stockItem, int quantity){
        if(stockItem!=null && quantity>0){
            int currentQuantity =  basket.getOrDefault(stockItem,0);
            basket.put(stockItem,quantity+currentQuantity);
            return currentQuantity;
        } else System.out.println("Not added to basket");
        return 0;
    }

    public void checkoutBasket(){
        //Since we need to remove entries from the Map we need to use an iterator
        Iterator<Map.Entry<StockItem,Integer>> iter = basket.entrySet().iterator();
        //for (StockItem si:basket.keySet()){
        while(iter.hasNext()){
            Map.Entry<StockItem,Integer> entry = iter.next();
            StockItem si = entry.getKey();
            int reservedQTY = si.getReservedQuantity();
            if(si.adjustStock(-reservedQTY)){
                if (si.setReservedQuantity(-reservedQTY)){
                    System.out.println("Item: "+si.getName()+" checkout successful");
                    iter.remove();

                } else{
                    System.out.println("Could not checkout basket. Reserved quantity not correct. ");
                }
            } else{
                System.out.println("Could not checkout basket. Not enough stock for item: "+si.getName()+" with stock quantity: "+si.getQuantity()+" and basket quantity: "+entry.getValue());
            }
        }
        System.out.println("Checkout basket completed");

    }
/**
* Notice that it is only the collection that is unmodifiable
 * The caller can still change the individual elements
 */
    public Map<StockItem,Integer> Items(){
        return Collections.unmodifiableMap(basket);
    }

    @Override
    public String toString() {
        String toReturn = "Shopping basket has"+basket.size() + " items \n";
        double totalBasketValue = 0;
        for (StockItem si:basket.keySet()){
            toReturn+=("Item:"+si.getName()+" Price:"+si.getPrice()+" Quantity:"+(basket.get(si))+"\n");
            totalBasketValue+= si.getPrice()*si.getQuantity();
        }
        toReturn+=("Total basket value:"+String.format("%1$.1f",totalBasketValue));
        return toReturn;
    }
}
