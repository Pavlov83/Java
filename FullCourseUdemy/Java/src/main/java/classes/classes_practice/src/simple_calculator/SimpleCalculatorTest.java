package src.simple_calculator;

public class SimpleCalculatorTest {

    public static void main(String[] args) {
        SimpleCalculator calc1 = new SimpleCalculator();
        calc1.setFirstNumber(200.00);
        calc1.setSecondNumber(100.00);
        System.out.println(calc1.sum());
    }
}
