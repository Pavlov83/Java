package linkedlists;

public class Main {


    public static void main(String[] args) {
        Customer customer= new Customer("Pav", 54.96);
        Customer anotherCustomer;
        anotherCustomer= customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() +
                " is"+ customer.getBalance() );
    }




}
