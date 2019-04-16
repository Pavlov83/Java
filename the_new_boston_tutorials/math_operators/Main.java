package com.company;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int tuna = 4;
        int salmon = 10;

        ++tuna; // pre-increment(increments before execution)
        System.out.println(tuna);
        tuna++;// post-increment(increments after execution)

        tuna = tuna + 5;// also written as tuna += 5

    }
}
