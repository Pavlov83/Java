package com.company;

public class Main {

    public static void main(String[] args) {
/*
        int count = 6;
        do{
            System.out.println("Count value was" + count);
            count++;

            if (count > 10){
                break;
            }
        }while(count != 6);
        */

        /*Create method called isEvenNumber that takes a parameter of type int
        It"s purpose is to determine if the argument passed to the method
        is an even number or not.
        return true if it is an even number otherwise return false;
         */


        int number = 5;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while(number <= finishNumber) {
            if (isEvenNumber(number)) {
                number++;
                continue;
            }

            evenNumbersFound++;
            if(evenNumbersFound >=5) {
                break;
            }
            System.out.println("Even number " + number);
            number++;
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);

        }
     public static boolean isEvenNumber(int arg){
         if(( arg % 2 == 0)) {
             return true;
         }else{
             return false;
         }


        }




    }
}
