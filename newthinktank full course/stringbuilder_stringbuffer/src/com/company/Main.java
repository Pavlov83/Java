package com.company;

import java.util.*;

import java.util.stream.IntStream;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        StringBuilder sb = new StringBuilder("I'm a string builder");

        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append(" Yeah ");
        System.out.println(sb.insert(6, "Big "));
        System.out.println(sb.replace(6,9, "wig"));
        System.out.println(sb.delete(6,10));
        System.out.println(sb.charAt(4));
        System.out.println(sb.indexOf("Yeah"));


    }
}
