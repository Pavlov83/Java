package constructors;

public class BankAcount {

    //Bank account challenge
    //Create a new class for a bank account
    //Create fields for the account number,balance,customer name,email,phone number
    //Create getters and setters for each field
    //Create two additional metheds
    //1. to allow the customer to deposit funds(also increment the balance field)
    //2. To allow the customer to withdraw funds. This should deduct from balance field
    //but not allow the withdrawal to complete if their are insufficiont funds
    //Add some println to the above methods

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public double withDrawFunds(double withdrawAmount){
        if(balance > withdrawAmount){
            this.balance -= withdrawAmount;
            return this.balance;
        }else{
            System.out.println("Insufficient balance!!");
            return 0;
        }
    }

    public void depositFunds(double depositAmount){
        this.balance += depositAmount;
    }

    public BankAcount(){}

    public BankAcount(String customerName,String email){
        this.customerName = customerName;
        this.email = email;
    }



}
