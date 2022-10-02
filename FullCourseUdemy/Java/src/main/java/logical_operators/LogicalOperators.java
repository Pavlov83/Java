package logical_operators;

public class LogicalOperators {

    public static void main(String[] args) {


        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("Not an alien");
        }

        int topScore = 100;
        if(topScore >= 100){
            System.out.println("You got the top score");
        }

        if(topScore>100 && !isAlien ){
            System.out.println("The top Score is 100 and not an alien");
        }
    }

    //we can evaluate two expressions


}