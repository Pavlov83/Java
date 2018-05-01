package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus;

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Javad",highScorePosition);

         highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Jimmy",highScorePosition);

         highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Pursey",highScorePosition);

         highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Hersham",highScorePosition);



        int highScore = calculateScore(gameOver, score, levelCompleted, 1);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        /* Create a method called displayHighScorePosition
        it should receive a players name as parameter and a second parameter as a position in the high score table
        We should display the players name with message, managed to get into position followed by their position
        and further message on the high score table"

        Create a second method called calculateHighScorePosition it should be sent one argument only (the player score)
        it should return an int
        the return data should be
        1 if the score is greater than 1000
        2 if the score is greater than 500 and less than 1000
        3 if the score is greater than 100 and less than 500
        4 in all other cases call both methods and display the results of the following
        a score  of 1500, 900, 400, 50
         */

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
        int finalScore = score + (levelCompleted * bonus);
        finalScore += 2000;
        return finalScore;
    }

        return -1;

      }

      public static void  displayHighScorePosition(String playerName,int position){
          System.out.println(playerName + "Managed to get into " + position + " on the highscore table");

      }

      public static int calculateHighScorePosition(int playerScore){

        if (playerScore >= 1000){
           return 1;

          } else if(playerScore > 500 && playerScore <= 1000){
            return 2;

          } else if(playerScore > 100 && playerScore <=500){
            return 3;

          } else {
            return 4;

        }


      }
}
