import controller.ScoreBoard;
import model.Balloon;
import model.Clown;
import model.SquareBalloon;

public class Main {

    public static void main(String[] args) {

        ScoreBoard scoreBoard = new ScoreBoard();
        System.out.println("Ballon Tap Score:");
        scoreBoard.algorithmBase = new Balloon();
        scoreBoard.showScore(10,5);

        System.out.println("clown top score:");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10,5);

        System.out.println("Square Balloon score:");
        scoreBoard.algorithmBase = new SquareBalloon();
        scoreBoard.showScore(40,7);


    }
}
