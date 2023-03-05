package logical_operators;

import jdk.swing.interop.SwingInterOpUtils;

public class OperatorsChallenge {



    public static void main(String[] args) {
        double myValue = 20.00;

        double mySecondValue = 80.00;

        double sumAndMultiplyByHundred = (myValue + mySecondValue) * 100;
        System.out.println(sumAndMultiplyByHundred);

        double findReminderOfFourty = 10000.0 % 40;
        System.out.println(findReminderOfFourty);

        boolean remainderValue = findReminderOfFourty == 0 ?true : false;

        System.out.println(remainderValue);

        if(!remainderValue){
            System.out.println("Got some remainder");
        }
    }



}
