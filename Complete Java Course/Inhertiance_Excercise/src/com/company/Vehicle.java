package com.company;

public class Vehicle {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentvelocity() {
        return currentvelocity;
    }

    public void setCurrentvelocity(int currentvelocity) {
        this.currentvelocity = currentvelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    private String name;
    private String size;

    private int currentvelocity;
    private int currentDirection;

    public Vehicle(String name, String size){
        this.name = name;
        this.size = size;

        this.currentvelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at" +
                currentDirection + "degrees");

    public void move(int velocity, int direction){
        currentvelocity = velocity;
        currentDirection = direction;
            System.out.println("Vehicle.move(): Moving at "
            + currentvelocity + "in direction " + currentDirection);
        }
    }
}
