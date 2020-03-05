package com.prgazevedo.timbuchalka.Section8.Arrays_Lists_Autoboxing.AutoboxingChallenge;

import java.util.ArrayList;
import java.util.Objects;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customerArrayList;

    public Branch(String branchName) {
        customerArrayList = new ArrayList<>();
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getCustomerAndTransactionListString(){
        String returnS="";
        returnS+="Branch name:"+branchName;
        for(Customer c:customerArrayList){
            returnS+="Customer name:"+c.getName();
            returnS+=c.getTransactionListString();
        }
        return returnS;
    }
    public String getCustomerListString(){
        String returnS="";
        returnS+="Branch name:"+branchName;
        for(Customer c:customerArrayList){
            returnS+="Customer name:"+c.getName();
        }
        return returnS;
    }

    public boolean hasCustomer(String customerName){
       return customerArrayList.contains(new Customer(customerName));
    }

    public void addCustomer(String customerName){
        Customer newCustomer = new Customer(customerName);
        if(!existsCustomer(newCustomer)) customerArrayList.add(newCustomer);

    }

    public void addCustomer(Customer newCustomer){

        if(!existsCustomer(newCustomer)) customerArrayList.add(newCustomer);

    }

    public void addCustomerTransaction(String customerName, Double transaction){
        getCustomer(customerName).addTransaction(transaction);
    }

    private Customer getCustomer(String name){
        int index = customerArrayList.indexOf(new Customer(name));
        return customerArrayList.get(index);
    }

    private boolean existsCustomer(Customer customer){
        return(customerArrayList.contains(customer));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return branchName.equals(branch.branchName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchName);
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchName='" + branchName + '\'' +
                '}';
    }
}
