package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("5 + 4 = "+(5+4));
        System.out.println("5 - 4 = "+(5-4));
        System.out.println("5 * 4 = "+(5*4));
        System.out.println("5 / 4 = "+(5/4));
        System.out.println("5 % 4 = "+(5%4));

        int incMe = 0 ;
        System.out.println("incMe : " + (incMe++));//post execution
        System.out.println("incMe : " + (++incMe));//pre execution

        int minNum = 5;
        int maxNum = 20;
        int randNum = minNum + (int)(Math.random() *
                ((maxNum - minNum) + 1));
        System.out.println("Rand :" + randNum);
    }
}
