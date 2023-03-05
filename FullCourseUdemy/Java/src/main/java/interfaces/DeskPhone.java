package interfaces;

public class DeskPhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    @Override
    public void powerOn(){
        System.out.println("No action");
    }

    @Override
    public void dial(int phoneNumber){
        System.out.println("Now ringing");
    }

    @Override
    public void answer(){
        if(isRinging){
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber){
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ringing...");
        }else{
             isRinging = false;
        }
        return false;
    }

    @Override
    public boolean isRinging(){
        return isRinging;
    }
}
