package com.company;

public class Main {

    public static void main(String[] args) {

        int value = 1;
        if (value == 1){
            System.out.println("The value is one");
        }else if(value == 2){
            System.out.println("The value is two");
        }else{
            System.out.println("was not one or two");
        }
        // we can do it in different way

        int switchValue = 1;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Actually it was :" + switchValue);

            default:
                System.out.println("Was not one or two");
                break;

             /* create a new switch statement using char insteas of int
         create a new char variable
         create a switch statement testing for A,B,C,D,E
         Display a message if any of these are found and then break
         Add a default which displays a message saying not found
         */

            char myChar = 'A';

            switch (myChar){

                case 'A':
                    System.out.println("It was A");
                    break;
                case 'B':
                    System.out.println("It was B");
                    break;
                case 'C':
                    System.out.println("It was C");
                    break;
                case 'D':
                    System.out.println("It was D");
                    break;
                case 'E':
                    System.out.println("It was E");
                    break;
                default:
                    System.out.println("Was not A,B,C,D,E");



            }


        }


    }
}
