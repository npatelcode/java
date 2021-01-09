package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Bank of Canada");
        bank.addBranch("Montreal");
        bank.addCustomer("Montreal","Naresh",500.50);
        bank.addCustomer("Montreal","Juhi",1000.02);

        bank.addBranch("Toronto");
        bank.addCustomer("Toronto","JB",500.50);
        bank.addCustomer("Toronto","Atharv",1000.02);

        bank.addCustomerTransaction("Montreal","Naresh",200.20);
        bank.addCustomerTransaction("Montreal","Juhi",350.20);
        bank.addCustomerTransaction("Montreal","Naresh",600.20);

        bank.listCustomer("Montreal",true);
        bank.listCustomer("Toronto",true);

        bank.addBranch("Winnipeg");

        if(!bank.addCustomer("Winnipeg","Jignesh",300.00)){
            System.out.println("Branch does not exists");
        }
        bank.listCustomer("Winnipeg",true);

        if(!bank.addBranch("Montreal")){
            System.out.println("Branch already exists");
        }
        if(!bank.addCustomerTransaction("Montreal","BOB",22.22)){
            System.out.println("Customer does not exists");
        }
    }
}
