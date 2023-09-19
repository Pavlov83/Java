package src;

public class BasicClass {


    public static void main(String[] args){
        System.out.println("Basic class");

        Car firstCar = new Car();
        firstCar.setMake("Aston Martin");
        firstCar.setColor("Blue");
        firstCar.setDoors(4);
        firstCar.setConvertible(true);
        firstCar.describeCar();
    }

}
