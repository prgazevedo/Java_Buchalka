package com.Section8.Arrays_Lists_Autoboxing.AutoboxingChallenge;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private ArrayList<Branch> branchArrayList;

    public Bank() {
    }

    private void addNewBranch(String branchName){
        branchArrayList.add(new Branch(branchName));
    }

    private void removeBranch(String branchName) {
        branchArrayList.remove(new Branch(branchName));
    }


    private void addCustomerToBranch(String customerName, Double initialTransaction, String branchName){
        getBranch(branchName).addCustomer(new Customer(customerName,initialTransaction));
    }

    private String getBranchList(){
        return "List of Branches is: \r"+ branchArrayList.toString();
    }

    private String getBranchAndCustomerListString(){
        String returnS="List of Branches, Customers and Transactions:\r";
        for(Branch b:branchArrayList){
            returnS+=b.getCustomerAndTransactionListString();
        }
        return returnS;
    }

    private Branch getBranch(String name){
        int index = branchArrayList.indexOf(new Branch(name));
        return branchArrayList.get(index);
    }


    public void runBank(){
        BankInterface BI= new BankInterface(this);
        BI.presentBankOptions();
        while(BI.processBankOptions());
    }

    class BankInterface{

        private Scanner scanner;
        private Bank bank;

        public BankInterface(Bank bank) {
            try (Scanner scanner = this.scanner = new Scanner(System.in)) {
            }
        }

        public void presentBankOptions(){
            System.out.println("Bank options:");
            System.out.println("1-Add Branch");
            System.out.println("2-Remove Branch");
            System.out.println("3-Select Branch options");
            System.out.println("4-List Branches and Customers");
            System.out.println("5-List Options again");
            System.out.println("6-Exit");
        }

        public boolean processBankOptions(){
            switch(scanner.nextInt()){
                case 1:
                    System.out.println("Selected 1-Add Branch");
                    bank.addNewBranch(getBranchName());
                    return true;
                case 2:
                    System.out.println("Selected 2-Remove Branch");
                    bank.removeBranch(getBranchName());
                    return true;
                case 3:
                    System.out.println("Selected 3-Branch Options");
                    String branchName=getBranchName();
                    presentBranchOptions();
                    processBranchOptions(branchName);
                    return true;
                case 4:
                    System.out.println("Selected 4-List Branches and Customers");
                    System.out.println(bank.getBranchAndCustomerListString());
                    return true;
                case 5:
                    System.out.println("Selected 5-List Options again");
                    return false;
                case 6:
                    System.out.println("Selected 6-Exit");
                    System.exit(0);
                default:
                    return false;

            }
        }

        public boolean processBranchOptions(String branchName) {
            Branch b=bank.getBranch(branchName);
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Selected 1-Add Customer");
                    b.addCustomer(getCustomerName());
                    return true;
                case 2:
                    System.out.println("Selected 2-List Customers");
                    System.out.println( b.getCustomerListString());
                    return true;
                case 3:
                    System.out.println("Selected 3-List Customers and Transactions");
                    System.out.println( b.getCustomerAndTransactionListString());
                    return true;
                case 4:
                    System.out.println("Selected 4-Add Customer transaction");
                    presentCustomerOptions();
                    processUserTransactions(b);
                    return false;
                case 5:
                    System.out.println("Selected 5-Exit");
                    return false;
                default:
                    return true;
            }
        }

        public void processUserTransactions(Branch b){
            String userName = getCustomerName();
            System.out.println("Transaction: ");
            while(scanner.hasNextDouble()){
                Double transaction = scanner.nextDouble();
                b.addCustomerTransaction(userName, transaction);
                System.out.println("Transaction: ");
            }
            System.out.println("No more transactions to add.");

        }

        private String getBranchName(){
            System.out.println("Enter branch name:");
            return scanner.nextLine();
        }
        private String getCustomerName(){
            System.out.println("Enter customer name:");
            return scanner.nextLine();
        }
        public void presentBranchOptions(){
            System.out.println("Branch options:");
            System.out.println("1-Add Customer");
            System.out.println("2-List Customers");
            System.out.println("3-List Customers and Transactions");
            System.out.println("4-Add Customer transaction");
            System.out.println("5-Exit");
        }

        public void presentCustomerOptions(){
            System.out.println("Customer - add transactions ");
            System.out.println("(+ deposit /- withdrawal)");
            System.out.println("any non number to return");
        }


    }


}
