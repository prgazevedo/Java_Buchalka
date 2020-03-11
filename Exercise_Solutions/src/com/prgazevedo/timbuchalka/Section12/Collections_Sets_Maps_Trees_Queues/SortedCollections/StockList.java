package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.SortedCollections;


import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String,StockItem> stockList;

    public StockList() {
        //With a linked HashMap we assure that we maintain the order of insertion.
        stockList = new LinkedHashMap<>();
    }

    public int addStock(StockItem stockItem){
        if(stockItem!=null){
            StockItem inStock =  stockList.getOrDefault(stockItem.getName(),stockItem);
            //if already exists in the StockList we add the quantity
            if(inStock != stockItem){
                inStock.adjustStock(stockItem.getQuantity());

            }
            else stockList.put(stockItem.getName(),stockItem);
            return stockItem.getQuantity();
        }
        return 0;
    }

    public int sellStock(String itemName, int quantity){
       StockItem stockItem =  stockList.getOrDefault(itemName,null);
        if(stockItem!=null && stockItem.getQuantity()>=quantity && quantity>0){
            stockItem.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem getItem(String itemName){
        return stockList.get(itemName);
    }

/**
 * Allows only a read-only view into our map.
 * Notice that this is faster than creating a copy of the map
 * if client tries to modify it will throw a unsupportedOperationException
 */
    public Map<String,StockItem> Items(){
        return Collections.unmodifiableMap(stockList);
    }

    @Override
    public String toString() {
        String toReturn = ("Stock List \n");
        double stockValue=0;
        for (StockItem si:stockList.values()){
            toReturn+=("Item: "+si.getName()+" with price: "+String.format("%1$.1f",si.getPrice())+" with quantity: "+si.getQuantity()+"\n");
            stockValue += si.getPrice()*si.getQuantity();
        }
        toReturn+=("Total stock value is: "+ String.format("%1$.1f",stockValue)+"\n");
        return  toReturn;
    }
}
