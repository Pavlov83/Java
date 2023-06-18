package com.company;

public class Main {

    public static void main(String[] args) {

        Data<String> d1 = new Data<>("This is d1");
        System.out.println(d1.toString());

        Data<Integer> d2 = new Data<>(10);

        System.out.println(d2.toString());
    }
}
