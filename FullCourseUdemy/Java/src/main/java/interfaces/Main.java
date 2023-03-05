package interfaces;

public class Main {

    public static void main(String[] args) {
        ITelephone pavlovPhone;
        pavlovPhone = new DeskPhone();
        pavlovPhone.powerOn();
        pavlovPhone.answer();

      ITelephone pavsMobilePhone = new MoiblePhone();
      pavlovPhone.powerOn();
      pavlovPhone.callPhone(54235);



    }
}
