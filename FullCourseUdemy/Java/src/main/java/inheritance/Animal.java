package inheritance;

import jdk.swing.interop.SwingInterOpUtils;

public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body,int size,int weight){

    }

    private String getName(){
        return name;
    }

    public int getBrain(){
        return this.brain;
    }

    public void eat(){
        System.out.println("The animal eats");
    }

    public void move(){

    }
}
