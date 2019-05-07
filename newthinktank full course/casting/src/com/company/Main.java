package com.company;

public class Main {

    public static void main(String[] args) {
	//casting means converting from one datatype to another

        int smInt = 10;
        long smLong = smInt;

        double cDbl = 1.234;
        int cInt = (int) cDbl;
        System.out.println(cInt);


       long bigLong = 234534500L;
       int bInt = (int) bigLong;
        System.out.println(bInt);

        String favNum = Double.toString(1.2345);
        //Byte.parseByte()
        int strInt = Integer.parseInt("10");
        System.out.println(strInt);



    }
}
