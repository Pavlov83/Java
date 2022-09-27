package variables;

public class Datatypes{


    public static void main(String[] args) {
        //Assigning value to variable is expression
        //Expression is construct that evaluates to single value

        //Integer have 32bit width.
        int myFirstNumber = 5;
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        int myLastOne = myTotal - 1000;
        System.out.println(myLastOne);

        //Byte's width is 8 bits wide
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value is " + myMinByteValue);
        System.out.println("Byte minimum value is " + myMaxByteValue);

        //Short can store 16bit numbers
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        //Long can store 64bit data
        long myLongValue = 100L;

        //32bit floating point
        Float myFloat = Float.MIN_VALUE;
        Float myMaxFloat = Float.MAX_VALUE;

        //64bit Double precision value
        Double myDouble = Double.MIN_VALUE;
        Double myMaxDouble = Double.MAX_VALUE;

    }
}
