package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 5 / 3; //width of 4 bytes
        float myFloatValue = 5f / 3f; // width of 4 bytes
        double myDoubleValue = 5d / 3d; // width of 8 bytes (faster on modern computers)
        System.out.println("myIntValue =" + myIntValue);
        System.out.println("myFloatValue =" + myFloatValue);
        System.out.println("myDoubleValue =" + myDoubleValue);


        //Convert a given number of pounds to kilograms
        //1 create  a variable to store the number of pounds
        //2. Calculate the number of kilograms for th number above and store it into variable
        //3. Print the result
        // Note: one pound is equal to 0.45359237

        //We can accept the input from the console :

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of pounds to convert");
        double Pounds = scan.nextDouble();
        double Kilograms = Pounds * 0.45359237;
        System.out.println(Kilograms);





    }
}