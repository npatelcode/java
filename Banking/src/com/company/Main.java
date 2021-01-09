package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Bank of Canada");
        bank.addBranch("Montreal");
        bank.addCustomer("Montreal","Tom",500.50);
        bank.addCustomer("Montreal","Harry",1000.02);

        bank.addBranch("Toronto");
        bank.addCustomer("Toronto","Bob",500.50);
        bank.addCustomer("Toronto","Jack",1000.02);

        bank.addCustomerTransaction("Montreal","Tom",200.20);
        bank.addCustomerTransaction("Montreal","Harry",350.20);
        bank.addCustomerTransaction("Montreal","Bob",600.20);

        bank.listCustomer("Montreal",true);
        bank.listCustomer("Toronto",true);

        bank.addBranch("Ottawa");

        if(!bank.addCustomer("Ottawa","Mike",300.00)){
            System.out.println("Branch does not exists");
        }
        bank.listCustomer("Ottawa",true);

        if(!bank.addBranch("Montreal")){
            System.out.println("Branch already exists");
        }
        if(!bank.addCustomerTransaction("Montreal","BOB",22.22)){
            System.out.println("Customer does not exists");
        }
    }
}
