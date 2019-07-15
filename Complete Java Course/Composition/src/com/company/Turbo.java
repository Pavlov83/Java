package com.company;

public class Turbo {


    public String getTurboName() {
        return turboName;
    }

    public int getTurboSize() {
        return turboSize;
    }

    public int getTurboType() {
        return turboType;
    }

    private String turboName;
    private int turboSize;
    private int turboType;


    public Turbo(String turboName, int turboSize, int turboType) {
        this.turboName = turboName;
        this.turboSize = turboSize;
        this.turboType = turboType;
    }

    public void loadTurbo(String turboName){
        System.out.println("Turbo " + turboName + "loaded...");
    }
}
