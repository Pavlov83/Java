package classes;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    public String getModel(){
        return this.model;
    }

    public void setModel(String modelName){
        String validModel = modelName.toLowerCase();
        if(validModel.equals("carrera")|| validModel.equals("911 turbo S")){
            this.model = modelName;
        }else{
            this.model="This model is not compatible,we need only 911 or Carrera";
        }

    }


}
