package classes;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car bmw = new Car();
        porsche.setModel("carrera");
        System.out.println(porsche.getModel());


     SimpleCalculator calculator = new SimpleCalculator();
     calculator.setFirstNumber(5.0);
     calculator.setSecondNumber(4);

     System.out.println("add= " + calculator.getAdditionResult());
     System.out.println("subtract= " + calculator.getSubtractionResult());
     System.out.println("divide= " + calculator.getDivisionResult());
     System.out.println("multiply= " + calculator.getMultiplicationResult());

    }

}
