package constructors;

public class Constructors {

    public static void main(String[] args) {

    BankAcount customer1 = new BankAcount();
    customer1.depositFunds(200.54);
        System.out.println(customer1.getBalance());

        customer1.depositFunds(68);
        System.out.println(customer1.getBalance());

        customer1.withDrawFunds(29);
        System.out.println(customer1.getBalance());

        BankAcount customer2 = new BankAcount("Peter Steele","steele@typeo.com");
        customer2.depositFunds(287);
    }

}
