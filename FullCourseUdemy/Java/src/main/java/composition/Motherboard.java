package composition;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;


    public String getModel(){
        return this.model;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    private int getRamSlots(){
        return this.ramSlots;
    }

    private int getCardSlots(){
        return this.cardSlots;
    }

    private String getBios(){
        return this.bios;
    }

    private void setModel(String model){
        this.model = model;
    }

    private void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    private void setRamSlots(int ramSlots){
        this.ramSlots = ramSlots;
    }

    private void setCardSlots(int cardSlots){
        this.cardSlots = cardSlots;

    }

    private void bios(String setBios){
        this.bios =  bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName +  "is now  loading...");
    }
}
