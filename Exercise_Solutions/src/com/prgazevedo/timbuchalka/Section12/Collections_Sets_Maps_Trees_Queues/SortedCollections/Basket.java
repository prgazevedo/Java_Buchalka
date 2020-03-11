package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.SortedCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Basket {
    private final String name;
    private Map<StockItem,Integer> basket;

    public Basket(String name) {
        this.name = name;
        this.basket = new HashMap<>();
    }

    public int addToBasket(StockItem stockItem, int quantity){
        if(stockItem!=null && quantity>0){
            int currentQuantity =  basket.getOrDefault(stockItem,0);
            basket.put(stockItem,quantity+currentQuantity);
            return currentQuantity;
        }
        return 0;
    }

    public Map<StockItem,Integer> Items(){
        return Collections.unmodifiableMap(basket);
    }

    @Override
    public String toString() {
        String toReturn = "Shopping basket has"+basket.size() + " items \n";
        double totalBasketValue = 0;
        for (StockItem si:basket.keySet()){
            toReturn+=("Item:"+si.getName()+"Price:"+si.getPrice()+" Quantity:"+(basket.get(si))+"\n");
            totalBasketValue+=(si.getPrice()*si.getQuantity());
        }
        toReturn+=("Total basket value:"+totalBasketValue);
        return toReturn;
    }
}
