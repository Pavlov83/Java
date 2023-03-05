package interfaces;

public class Gearbox {

    private boolean clutchPushed;

    public void operateClutch(String inOrOut){
        this.clutchPushed = inOrOut.equalsIgnoreCase("in");
    }
}
