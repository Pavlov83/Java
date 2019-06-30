package com.company;

public class Main {

    public static void main(String[] args) {

        //Class is a blueprint for creating objects
        //Every object have state and behavior

        Car porsche = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is "+ porsche.getModel());

    }
}
