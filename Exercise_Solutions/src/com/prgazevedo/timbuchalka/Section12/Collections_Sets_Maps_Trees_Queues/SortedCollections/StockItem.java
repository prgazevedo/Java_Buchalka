package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.SortedCollections;

import java.util.Objects;

/**
 *notice that we implemented the comparable interface in the StockItem
 *this is used for the treemap (compareTo is called) to order the collection
 *in comparison with the HashMap that return scrambled entries
 */
public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quantity=0;
    private int reservedQuantity;

    public int getReservedQuantity() {
        return reservedQuantity;
    }



    public StockItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.reservedQuantity=0;
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

    public boolean setReservedQuantity(int reservation){
        if(reservation>0){
            //check that enough stock exists
            if(quantity-reservedQuantity-reservation>0){
                reservedQuantity+=reservation;
                System.out.println("Item: "+ name+ " was reserved: "+reservation+ " total reservation: "+reservedQuantity);
                return true;
            }else{
                System.out.println("Sorry not enough stock to make reservation.\n Stock: "+quantity+" Already reserved: "+reservedQuantity+ " This reservation: "+reservation );
                return false;
            }
        }else if(reservedQuantity+reservation>=0){
            reservedQuantity+=reservation;
            System.out.println("Reservation was released. Current reserved quantity is: "+reservedQuantity);
            return true;
        }
        return false;
    }

    //stock change might be negative
    public boolean adjustStock(int stockChange){
        int newQuantity = quantity+stockChange;
        if(newQuantity>0){
            quantity=newQuantity;
            return true;
        }
        return false;
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
