package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        /* using the for statement call calculateInterest method with the
        amount of 1000 with an interestRate of 2,3,4,5,6,7,8 and print the results
         */

        for (int i = 8; i > 1; i--) {
            System.out.println("10 000 at " + i + "% interest =" + String.format("%.2f", calculateInterest(10000.0, i)));

        }

        int count = 0;
        for (int i = 10; i < 50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number" + i +"is prime number;");
                if(count == 13){
                    System.out.println("Exiting the loop");
                    break;
                }

            }


        }

    }
    //Create a for statement using any range of numbers
    //Determine if the number is a prime number using the isPrime method
    //if it is a prime number - print it out and increment a count of the numbers found
    // when that count is three exit the for loop
    //hint: Use the break; statement to exit





    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount *interestRate/100);
    }

}
