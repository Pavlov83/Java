package com.company;

public class Main {

    public static void main(String[] args) {

        User user = new User("Pav");
        System.out.println(user.name);
        user.sayHello();

        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();


    }

    public static TaxCalculator getCalculator(){
        return new TaxCaclulator2022();
    }
}
