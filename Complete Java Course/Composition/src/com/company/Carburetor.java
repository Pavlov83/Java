package com.company;

public class Carburetor {


    private String carbSize;
    private String manuFacturer;
    private int adjustmentsAmount;

    public Carburetor(String carbSize, String manuFacturer, int adjustmentsAmount) {
        this.carbSize = carbSize;
        this.manuFacturer = manuFacturer;
        this.adjustmentsAmount = adjustmentsAmount;
    }

    public void loadCarb(String carbRun){
        System.out.println("Carb is now" + carbRun);
    }


    public String getCarbSize() {
        return carbSize;
    }

    public void setCarbSize(String carbSize) {
        this.carbSize = carbSize;
    }

    public String getManuFacturer() {
        return manuFacturer;
    }

    public void setManuFacturer(String manuFacturer) {
        this.manuFacturer = manuFacturer;
    }

    public int getAdjustmentsAmount() {
        return adjustmentsAmount;
    }

    public void setAdjustmentsAmount(int adjustmentsAmount) {
        this.adjustmentsAmount = adjustmentsAmount;
    }


}
