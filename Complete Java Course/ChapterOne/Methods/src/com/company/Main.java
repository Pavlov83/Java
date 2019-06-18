package com.company;

public class Main {

    public static void main(String[] args) {
    //we are using the examples from the previous lesson


       calculateScore(true,800,5,100);

       calculateScore(true, 700, 6,200);




    }

    public int calculateScore(boolean gameOver, int score,
                              int levelCompleted, int bonus){


        if(gameOver){

            int finalScore = score + (levelCompleted * bonus);
            finalScore += 100;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
            return -1;


    }

}
