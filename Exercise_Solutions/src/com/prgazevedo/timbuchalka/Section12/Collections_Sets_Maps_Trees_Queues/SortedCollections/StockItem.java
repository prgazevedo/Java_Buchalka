package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.SortedCollections;

import java.util.Objects;

public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quantity=0;

    public StockItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price){
        if(price>0.0) this.price=price;
    }

    public void setQuantity(int quantity) {
        if(quantity>0.0) this.quantity = quantity;
    }

    public void adjustStock(int stockChange){
        int newQuantity = quantity+stockChange;
        if(newQuantity>0) quantity=newQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        StockItem stockItem = (StockItem) o;
        return Objects.equals(name, stockItem.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 47;
    }

    @Override
    public int compareTo(StockItem o) {
        if(o == this) return 0;
        if(o!=null){
            return this.name.compareTo(o.getName());
        }
        else{
            throw new NullPointerException();
        }
    }
}
