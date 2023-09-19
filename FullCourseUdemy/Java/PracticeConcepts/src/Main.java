import classes.BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setBalance("200");
        account1.setNumber("001");
        System.out.println(account1.getBalance());

        BankAccount account2 = new BankAccount("Number1",
                "0.00",
                "customeremail@email.com");
        System.out.println(account2.getBalance());
    }
}