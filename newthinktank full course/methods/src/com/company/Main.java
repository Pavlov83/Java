package com.company;

import java.util.*;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static int getSum(int x, int y) {
        return x + y;
    }
        public static void changeMe(int cNum){
            cNum = 10;
        }

        public static void main(String[] args) {

            System.out.println("5 + 4 =" + getSum(4,5));

            int cNum = 0;
            changeMe(cNum);
            System.out.println("cNum = " + cNum);

        }

        public static int getSum2(int ... nums) {
            int sum = 0;
            for (int x : nums) {
                sum += x;
            }
            return sum;
        }

        static int[] getNext2(int x) {
            int[] vals = new int[2];
            vals[0] = x + 1;
            vals[1] = x + 2;
            return vals;
        }


        //return list of different types

        static  int[] multVA = getNext2(5);
        for(int x: multVA) System.out.println(x);

       static List<Object> getRandList();
        String name = "Pavel";
        int age = 36;
        return Arrays.asList(name, age);
    }

