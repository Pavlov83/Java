package interfaces;

public class Main {

    public static void main(String[] args) {
        ITelephone pavlovPhone;
        pavlovPhone = new DeskPhone();
        pavlovPhone.powerOn();
        pavlovPhone.answer();

    }
}
