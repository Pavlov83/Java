package classes;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Pavel",20.00,"pavlov@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getCreditLimit());

        Customer secondCustomer = new Customer();

        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getEmail());
        System.out.println(secondCustomer.getCreditLimit());
    }
}
