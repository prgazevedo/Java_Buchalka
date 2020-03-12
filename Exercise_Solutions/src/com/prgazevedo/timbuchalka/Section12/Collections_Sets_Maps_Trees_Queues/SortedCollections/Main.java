package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.SortedCollections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static StockList stockList = new StockList();
    private static List<Basket> basketList = new ArrayList<>();
    public static void main(String[] args) throws CloneNotSupportedException {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("toy car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println("Initial Stock List");
        System.out.println(stockList);

        System.out.println("Basket");
        Basket myBasket = new Basket("My Basket#1");
        sellItem(myBasket,"star",1);
        sellItem(myBasket,"toy car",1);
        sellItem(myBasket,"vase",10);
        sellItem(myBasket,"bread",2);
        sellItem(myBasket,"bread",20);
        sellItem(myBasket,"bread",120);
        System.out.println(myBasket);
        System.out.println("Intermediate Stock List");
        System.out.println(stockList);
        System.out.println("Checkout basket");
        basketList.add( myBasket.checkoutBasket());
        Basket myBasket2 = new Basket("My Basket#2");
        sellItem(myBasket2,"phone",1);
        sellItem(myBasket2,"towel",1);
        sellItem(myBasket2,"vase",10);
        sellItem(myBasket2,"juice",2);
        sellItem(myBasket2,"bread",20);
        sellItem(myBasket2,"chair",10);
        System.out.println("Checkout basket");
        basketList.add( myBasket2.checkoutBasket());
        System.out.println("Final Stock List");
        System.out.println(stockList);
        System.out.println("==========================================================");
        System.out.println("List of purchased baskets is:");
        for (Basket b:basketList){
            System.out.println(b);
        }
    }

    public static int sellItem(Basket basket,String itemName,int quantity) {
        if(basket!=null && quantity>0){
            StockItem stockItem = stockList.getItem(itemName);
            if(stockItem== null) System.out.println("That item: "+itemName+" is not for sale");
            else{
                if(stockList.checkStock(itemName,quantity)!=0){
                    basket.addToBasket(stockItem,quantity);
                    System.out.println(itemName+" was added to basket.");
                }
                else System.out.println("No stock!");

            }
        }
        return 0;

    }
}
