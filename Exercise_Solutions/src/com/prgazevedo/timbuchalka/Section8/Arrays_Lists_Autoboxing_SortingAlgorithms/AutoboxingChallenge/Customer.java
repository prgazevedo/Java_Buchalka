package com.prgazevedo.timbuchalka.Section8.Arrays_Lists_Autoboxing_SortingAlgorithms.AutoboxingChallenge;

import java.util.ArrayList;
import java.util.Objects;

public class Customer {
    private String name;
    private ArrayList<Double> transactionsArrayList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransactionListString(){
        String returnS="";
        for(Double d:transactionsArrayList){
            returnS += "Transaction: " + d.toString();
        }
        return returnS;
    }

    public Customer(String name) {
        transactionsArrayList = new ArrayList<>();
        this.name = name;
    }

    public Customer (String name, Double initTransaction){
        this(name);
        transactionsArrayList.add(initTransaction);
    }

    public void addTransaction(Double transaction){
        transactionsArrayList.add(transaction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return name.equals(customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactionsArrayList=" + transactionsArrayList +
                '}';
    }
}
