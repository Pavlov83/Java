public class calculateScore {

         /* Create a method to display highscore position
        it should receive a players name as parameter and a second parameter
        as a position in a highscore table

        Create a second method called calculateHighScorePosition
        it should be sent one argument only, the player score
        it should return an int
        the return data should be
        1 if the score is >1000
        2 if the score is >500 and <1000
        3 if the score is >100 and < 500
        4 in all other cases call both methods and display the results of the following
        a score of 1500,900,400, 50
         */


         public static void displayHighScore(String PlayerName,int highScorePos){

         public static int calculatePosition(int PlayerScore){
             System.out.println(PlayerName + "managed to get into position"
             + highScorePos + "on the highscore table");
         }
         if(PlayerScore > 1000){
             return 1;
         }else if(PlayerScore > 500 && PlayerScore < 1000){
             return 2;
         }

             }

}
