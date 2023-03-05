package methods;

public class MethodOverloading {


    public static void main(String[] args) {
        int newScore = calculateScore("Tim",500);
        System.out.println("New score is " + newScore);

        calculateScore(74);
        calculateScore("Pav", 123);

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player" + playerName + " scored" + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player score" + score + "points");
        return score * 1000;
    }
}
