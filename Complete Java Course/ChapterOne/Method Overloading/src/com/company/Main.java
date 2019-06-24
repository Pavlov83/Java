package com.company;

public class Main {

    public static void main(String[] args) {

        int currentScore = calculateScore("Pavel ", 500);
        System.out.println("new score is " + currentScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + score + " points");
        return score * 500;

    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 500;

    }

    public static int calculateScore() {
        System.out.println("No player name,no player score");
        return 0;

    }

    double centimeters = calcFeetAndInchesToCentimeters(6, 1);
    if(centimeters< 0.0)

    {
        System.out.println("Invalid paramaters");

        calcFeetAndInchesToCentimeters(100);
    }



    /* Create a method called calcFeetAndInchesToCentimeters
        It needs to have two parameters
        feet is the first parameter, inches is the second parameter

        You should validate that the first parameter feet is >= 0
        You should validate that the 2nd parameter is >= 0 and <= 12
        return -1 from the method if of either of the above is not true

        If the parameters are valid, then calculate how many centimeters
        comprise the feet and inches passed to this method and return that value

        Create 2nd method of the same name but only one parameter(inches)
         validate that its >= 0
         return -1 if it is not true
         But if its valid then calculate how many feet are in the inches
         and then there is the tricky part:
         call overloaded method passing the correct feet and inches
         calculated so that it can calculate correctly
         hints: Use double for your number datatypes
         1 inch = 2.54cm and one foot = 12 inches
         use the link I give you to confirm your code is calculating correctly
         Calling another overloaded method just requires you to use the right number of parameters

     */

    public static int calcFeetAndInchesToCentimeters(int feet, int inches) {
        if ((feet < 0) || (inches < 0) && (inches > 12)) {
            System.out.println("Invalid parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "feet" + inches + "inches" + centimeters + " cm.");
        return centimeters;
    }
        public static double calcFeetAndInchesToCentimeters(double inches){
            if(inches < 0){
                return -1;
            }

            double feet = (int)inches /12;
            double remainingInches = (int)inches % 12;
            System.out.println(inches + "inches is equal to " + feet +
                    "feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }

}

