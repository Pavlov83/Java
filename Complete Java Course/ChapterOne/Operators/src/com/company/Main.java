package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2 ;
        System.out.println("The sum of 1 and 2 =" + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + "- 1 = " + result);

        previousResult = result;

        result = result * 10 ;
        System.out.println(previousResult + "* 10" + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + "/ 5" + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + "% 3" + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now" + result);

        result += 2;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an Alien");

        int topScore = 100;
        if (topScore < 100)
            System.out.println("You got the high score");

        int secondTopScore = 95;
        if(topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than top score and less than 100");


        if((topScore > 90) || (secondTopScore <=90))
            System.out.println("one of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is not an error");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not suppose to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        //1. Create a double variable with the value 20
        double myDouble = 20;
        //2. Create a second variable of type double with value 80
        double mySecondDouble = 80;
        //3. Add both numbers and multiply by 25
        double sum = myDouble + mySecondDouble * 25;
        //4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        double remain = sum %  40;
        //5. Write an "if" statement that displays a message "Total was over the limit"
        //   if the remaining total(#4) is equal to 20 or less.
        if (remain <= 20)
            System.out.println("total was over the limit");

    }
}
