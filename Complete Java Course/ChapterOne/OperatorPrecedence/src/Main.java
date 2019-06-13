
public class Main{

    public static void main(String[] args){
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + "-1 =" + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 =" + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + "/ 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;

        result = result += 2;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);

        result *= 10;
        System.out.println("Result is now " + result);

        result -= 10;
        System.out.println("Result is now " + result);

        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an Alien");

        int topScore = 80;
        if(topScore < 100)
            System.out.println("You got High Score");

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than top score and less than 100");


        if((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");


        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is true");

        boolean thisCar = false;
        if(thisCar == true)
            System.out.println("This is not suppose to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");


         /* Create multiline variable with the value of 20
        Create a second variable of type double with the value 80
        add both numbers and multiply by 25
        Use the remainder operator to figure out the remainder from the
        sum of #3 divided by 402
        Write an if statement that displays a message "total was over the limit"

     */

        double var1 = 20;
        double var2 = 80;
        double sum = (var1 + var2) * 25;
        double op3 = sum % 40;

        if(op3 >=20)
            System.out.println("Total was over the limit");




    }
}