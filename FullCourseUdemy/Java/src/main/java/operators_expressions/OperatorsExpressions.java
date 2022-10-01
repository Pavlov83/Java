package operators_expressions;

public class OperatorsExpressions {

    public static void main(String[] args) {

        //Operand is an object manipulated by operator (e.g. +,-,/,*)

        //Expression is formed by combining variables,operators,literals,method returns

        //addition
        int result = 1 + 2;
        System.out.println("1 + 2 =" + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        //substraction
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        //multiplication
        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 =" + result);

        // division
        result = result / 5;
        System.out.println("20 /5 = " + result);
        System.out.println("previous result is " + previousResult);

        //remainder
        result = result % 3;
        System.out.println("4 % 3 = " + result);

    }
}
