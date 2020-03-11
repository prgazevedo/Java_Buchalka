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
        }
        return 0;
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
