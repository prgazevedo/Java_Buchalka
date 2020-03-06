package com.prgazevedo.timbuchalka.Section8.Arrays_Lists_Autoboxing_SortingAlgorithms.AutoboxingChallenge;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branchArrayList;

    public Bank() {
        branchArrayList = new ArrayList<>();
    }

    public boolean addNewBranch(String branchName){
        return branchArrayList.add(new Branch(branchName));

    }

    public boolean removeBranch(String branchName) {
        return branchArrayList.remove(new Branch(branchName));

    }


    public void addCustomerToBranch(String customerName, Double initialTransaction, String branchName){
        getBranch(branchName).addCustomer(new Customer(customerName,initialTransaction));
    }

    private String getBranchList(){
        return "List of Branches is: \r"+ branchArrayList.toString();
    }

    public String getBranchAndCustomerListString(){
        String returnS="List of Branches, Customers and Transactions:\r";
        for(Branch b:branchArrayList){
            returnS+=b.getCustomerAndTransactionListString();
        }
        return returnS;
    }

    public boolean isBranch(String branch){
        return branchArrayList.contains(new Branch(branch));
    }
    public Branch getBranch(String name){

        int index = branchArrayList.indexOf(new Branch(name));
        return branchArrayList.get(index);
    }


    public void runBank(){
        BankInterface BI= new BankInterface(this);
        BI.runBankInterface();
    }


}
