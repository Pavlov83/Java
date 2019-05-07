package com.company;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        String name = "Pavel";
        String wName = "Pavlov";
        wName += "is my name"; // we can use += not only for math
        String drsDog = "K" + 9;

        System.out.println(wName.charAt(0));// access characters at string index
        System.out.println(wName.contains("Pavel")); //returns True or False
        System.out.println(wName.indexOf("Pavel"));
        System.out.println(wName.length());

        System.out.println("dog equals cat : " + ("dog".equalsIgnoreCase("cat")));


        System.out.println(wName.compareTo("ABC"));

        System.out.println(wName.replace("Derek","Bob"));

        System.out.println(wName.substring((0,5));


        for(String x: wName.split("")) System.out.println(x);

    }
}
