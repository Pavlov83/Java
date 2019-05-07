package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {
	// Array can be approached as box of memory that allows you to assign name to multiple values

    int[] a1 = new int[10];
    a1[0] = 1;
    Arrays.fill(a1,2);
        System.out.println(a1[0]);
        System.out.println(a1.length);
        String[] a2 = {"one","two"};

        int[] oneTo10 = IntStream.rangeClosed(1,10).toArray();//create array with values 1 to 10

        for(int x: oneTo10 ) System.out.println(x);     //ehanced for loop

        System.out.println(Arrays.binarySearch(oneTo10, 9));// shows on which index we have this value


        //Twodimensional Arrays

        int a3[] [] = new int[2] [2];
        String[] [] a4 = {{"00","10"},
                {"01","11"}};

        System.out.println(a4[1][1]);

        //Tridimensional Arrays

        // a5[how may down],[how many across],["how many groups"]

        String a5 [] [] [] = {{{"000"},{"100"},{"200"},{"300"}},
                              {{"010"},{"110"},{"210"},{"310"}},
                              {{"020"},{"120"},{"220"},{"320"}}};

        System.out.println(a5[2][3][0]);

        int a6[] = {1,2,3};
        int a7[] = Arrays.copyOf(a6,3);
        System.out.println(Arrays.equals(a6,a7));
        int a8[] = {3,2,1};
        Arrays.sort(a8);
        System.out.println(Arrays.toString(a8));



    }
}
