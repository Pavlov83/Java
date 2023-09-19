package src;

public class Car {

    private String make;
    private  String color;
    private String model;

    private boolean convertible;
    private int doors;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "Aston","Bentley","Rolls" -> this.make = make;
            default ->{
                this.make = "Unsupported";

            }
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(doors + "- Door" + color +
                " " + make + " " + "Convertible");
    }
}
