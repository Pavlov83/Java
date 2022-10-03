package logical_operators;

public class LogicalOperators {

    public static void main(String[] args) {


        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("Not an alien");
        }

        int topScore = 105;
        if(topScore >= 100){
            System.out.println("You got the top score");
        }
        //Logical "AND" - evaluates to ture if both sides are true
        if(topScore>100 && !isAlien ){
            System.out.println("The top Score is 100 and not an alien");
        }

        //Logical "OR" evaluates to true if one of the sides is true
        if(topScore > 100  || !isAlien){
            System.out.println("Either topscore is greater than 100 or is not alien");

        }
    }





    //we can evaluate two expressions



}