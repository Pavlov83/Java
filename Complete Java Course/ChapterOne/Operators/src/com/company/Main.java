package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2 ;// = is assignment operator
        System.out.println("1 + 2 = " + result );

        int previousResult = result;

        result = result - 1;

        result = result * 10;
        System.out.println(previousResult + " * 10 =" + result);

        previousResult = result;

        result  = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;

        result = result + 1;
        System.out.println("Result is now" + result);

        result ++;
        System.out.println("Result is now" + result);

        result --;
        System.out.println("Result is now" + result);

        result += 2;
        System.out.println("Result is now" + result);

        result -= 2;
        System.out.println("Result is now" + result);

        result *= 2;
        System.out.println("Result is now" + result);

        result /= 2;
        System.out.println("Result is now" + result);


        boolean isAlien = false;

        if(isAlien == false)
            System.out.println("It is not an alien");

        int topScore = 100;

        int secondTopScore = 60;

        if(topScore >= 100)
            System.out.println("You got the top score!");

        if(topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than  second top score and less than hundred");

    }
}
