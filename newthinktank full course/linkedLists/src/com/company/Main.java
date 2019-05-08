package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	// In linked lists each item have only reference to the value before and value after

        LinkedList<Integer> iL1 = new LinkedList<Integer>();
        iL1.add(1); iL1.add(2); iL1.add(3);
        iL1.addAll(Arrays.asList(1,2,3,4));
        iL1.addFirst(0);

        System.out.println(iL1.contains(4));
        System.out.println(iL1.indexOf(4));
        iL1.set(0,2);
        System.out.println(iL1.get(0));
        iL1.remove(1);
        System.out.println(iL1.size());
        Object[] a9 = iL1.toArray();
        for(Integer x: iL1) System.out.println(x);



    }
}
