package classes;

public class BankAccount {

    public BankAccount(){

    }
    public BankAccount(String accountNumber,String accountBalance,String customerEmail){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerEmail = customerEmail;
        System.out.println();
    }


    private String accountNumber;
    private String accountBalance;

    private String customerEmail;

    private String customerPhone;

    public void setNumber(String number){
        this.accountNumber = number;

    }

    public void setCustomerEmail(String email){
        this.customerEmail = email;
    }

    public void setBalance(String balance){
        this.accountBalance = balance;
    }

    public void setCustomerPhone(String phoneNumber){
        this.customerPhone = phoneNumber;
    }

    public String getNumber(){
        return this.accountNumber;
    }

    public String getBalance(){
        return this.accountBalance;
    }

    public String getCustomerEmail(){
        return this.customerEmail;
    }

}
