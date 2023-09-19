package inheritance.practice;

public class CarMaker {

    private String color;
    private String model;
    private String make;

    private boolean isConvertible;

     public void setColor(String color){
         this.color = color;
     }

     public void setMake(String make){
         this.make = make;
     }

     void setModel(String model){
         this.model = model;
     }

    public void describeCar(){
        System.out.println(this.color + " color" + " "+
                           this.make + " make" + " "
                         + this.model + " model" + (isConvertible? "Convertible" : " "));
    };
}
