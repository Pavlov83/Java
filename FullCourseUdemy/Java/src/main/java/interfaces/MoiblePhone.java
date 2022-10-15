package interfaces;

public class MoiblePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    @Override
    public void powerOn(){
        this.isOn = true;
        System.out.println("Mobile phone powered up!!");
    }

    @Override
    public void dial(int phoneNumber){
        if(isOn) {
            System.out.println("Now ringing");
        }else{
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer(){
        if(isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber){
        if(phoneNumber == myNumber && isOn){
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
