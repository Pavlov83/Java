package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double firstNum,secondNum,result;
        System.out.println("Enter First Number:");
        firstNum = scan.nextDouble();
        System.out.println("Enter Second Number:");
        secondNum = scan.nextDouble();

        result = firstNum + secondNum;

        System.out.println(result);


    }
}
