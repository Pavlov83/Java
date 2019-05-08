package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println(i);

        }

        int wL = 0;
        while(wL < 20){
            if(wL % 2 == 0){
                System.out.println(wL);
                wL++;
                continue;
            }
            if(wL >= 10){
                break;
            }
            wL++;
        }

        int secretNum = 7;
        int guess = 0;
        do {
            System.out.println("Guess : ");
            if(sc.hasNextInt()){
              guess = sc.nextInt();
            }
        }while (secretNum != guess);
        System.out.println("You guessed in");


    }
}
