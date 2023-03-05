package strategy_pattern;

public class PaymentByPayPal implements PaymentService{

    private String email;
    private String password;

    @Override
    public void collectPaymentDetails(){

    }

    @Override
    public boolean validatePaymentDetails(){
        return false;
    }

    @Override
    public void pay(int amount){
        System.out.println("Paying" + amount + "by card");
    }

}
