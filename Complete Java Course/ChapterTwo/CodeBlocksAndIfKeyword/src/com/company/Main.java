package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {
    /*
            System.out.println("Your score was less than 5000");

        } else if(score < 1000){

            System.out.println("You are under 1000");


        } else {
            System.out.println("Got here");

        }
     */

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        //Print out a second score on the screen with
        //score set to 10000
        //level completed set to 8
        //bonus set to 200
        //but make sure the first printout is still displayed

        boolean newgameOver = true;
        int newscore = 1000;
        int newlevelCompleted = 8;
        int newbonus = 200;

        if(newgameOver){
                int finalScore = newscore + (newlevelCompleted * newbonus);
                System.out.println("Your final score was " + finalScore);
            }

    }




}
}
