package controller;

public class ScoreBoard {

    public ScoreAlgorithmBase algorithmBase;

    public void showScore(int taps,int multiplier){
        System.out.print(algorithmBase.calculateScore(taps,multiplier));
    }
}
