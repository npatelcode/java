package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;
    public Bank(String name){
        this.name=name;
        this.branches=new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName,String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName,initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName,String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            return branch.addCustomerTransaction(customerName,amount);
        }
        return false;
    }
    private Branch findBranch(String branchName){
        for(int i=0;i<this.branches.size();i++){
            if(this.branches.get(i).getName().equals(branchName)){
                return this.branches.get(i);
            }
        }
        return null;
    }


    public boolean listCustomer(String branchName,boolean showTransaction){
        Branch branch=findBranch(branchName);
        if(branch!=null){
            System.out.println("Customers details for branch : "+branchName);
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0; i<branchCustomers.size();i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer:"+branchCustomer.getName()+" ["+(i+1)+"]");
                if(showTransaction){
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions= branchCustomer.getTransactions();
                    for(int t=0;t<transactions.size();t++){
                        System.out.println("Transaction "+(t+1)+" of amount "+transactions.get(t));
                    }
                }
            }
            return true;
        }else{
            return false;
        }
    }
}
