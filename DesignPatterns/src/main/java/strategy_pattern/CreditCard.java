package strategy_pattern;

public class CreditCard {

    private int amount = 10;
    private final String number;
    private final String date;
    private final String cvv;

    public CreditCard(String number, String date,String cvv) {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }


}
