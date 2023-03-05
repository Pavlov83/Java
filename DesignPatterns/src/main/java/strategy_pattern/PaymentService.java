package strategy_pattern;

public interface PaymentService {

    void collectPaymentDetails();
    boolean validatePaymentDetails();
    void pay(int amount);


}
