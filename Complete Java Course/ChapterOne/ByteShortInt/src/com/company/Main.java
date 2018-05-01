package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByte = 3;
        short myShort = 1024;
        int myInt = 345443;
        long myLong = 50000L + (myByte * 10) + myShort + myInt;

        System.out.println(myLong);

    }
}
