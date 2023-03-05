package methods;

public class MethodsChallenge {

    public static void main(String[] args) {

        /*create a method displayHighScorePosition
       the methods should accept a players name as parameter
       and a 2nd parameter as a position in a high score table you should display a player's name along
       with a message like "you are on position five"

       create a second method called calculateHighScorePosition
       it should accept only player score argument
       it should return an int
       the return data should be :
       1 if the score is >1000
       2 if the score is >500 and <500
       3 if the score is > 100 and < 500
       4 in all other cases

       call both methods and display the results of 1500,900,400,50
         */
        MethodsChallenge playerInstance = new MethodsChallenge();
        System.out.println(playerInstance.displayHighScorePosition("Pav",playerInstance.calculateHighScorePosition(1200)));


    }

    public String displayHighScorePosition(String playerName, int position) {
        return playerName + " is on position: " + position;
    }

    public int calculateHighScorePosition(int playerScore) {

        if (playerScore > 1000) {
            return 1;
        }else if (playerScore > 500 && playerScore < 1000){
            return 2;
        }else if(playerScore > 100 && playerScore < 500){
            return 3;
        }
        return 0;
    }

}
