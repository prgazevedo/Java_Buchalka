package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.SortedCollections;

public class Main {
    private static StockList stockList = new StockList();
    public static void main(String[] args) {
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


        System.out.println(stockList);

        System.out.println("Basket");
        Basket myBasket = new Basket("My Basket");
        sellItem(myBasket,"star",1);
        sellItem(myBasket,"toy car",1);
        sellItem(myBasket,"vase",10);
        sellItem(myBasket,"bread",2);
        System.out.println(myBasket);


        System.out.println(stockList);

    }

    public static int sellItem(Basket basket,String itemName,int quantity) {
        if(basket!=null && quantity>0){
            StockItem stockItem = stockList.getItem(itemName);
            if(stockItem== null) System.out.println("That item is not for sale");
            else{
                if(stockList.sellStock(itemName,quantity)!=0){
                    basket.addToBasket(stockItem,quantity);
                    System.out.println(itemName+" was added to basket.");
                }
                else System.out.println("No stock!");

            }
        }
        return 0;

    }
}
