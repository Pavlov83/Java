package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// arraylist have the advantage to expand,insert and delete values

        // Arrays are boxes in memory that hold
        // multiple values

        // Sort array
        int a8[] = {3,2,1};
        Arrays.sort(a8);
        System.out.println(Arrays.toString(a8));

        ArrayList<String> aL1 = new ArrayList<String>(20);
        aL1.add("Sue"); //adds to the arraylist

        ArrayList<Integer> aL2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        for(Integer x: aL2) System.out.println(x);
        System.out.println(aL2.get(1));
        aL2.set(1,5);
        aL2.remove(3);



    }
}
