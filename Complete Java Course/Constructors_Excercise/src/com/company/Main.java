package com.company;

public class Main {

    public static void main(String[] args) {

        //Create a class for a bank account
        //Create fields for account number,balance,customer name,email,phone

        //create getters and setters for each field
        //Create two additional methods
        //1. allow the customer to deposit funds
        //2. allow the customer to withdraw but not allow if insufficient funds
        //3.add print statements in those methods as well


    Account bobsAccount = new Account(234,468.8,"Bob Saget",
            "saget@saga.com","555-111-333");

    bobsAccount.deposit(50.0);
    bobsAccount.withdrawal(100);


    }
}
