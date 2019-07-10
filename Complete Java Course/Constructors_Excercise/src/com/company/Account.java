package com.company;

public class Account {

    private int accountNumber;
    private double balance;
    private String UserName;
    private String Email;
    private String phoneNumber;

    //We are making our constructor
    public Account(){
        //this is how we are adding defult paramters
        this(111,000,"Default",
                "default@bank.com","111-222-333");
        System.out.println("Empty constructor called with def. parameters");
    }

    // We can override constructors
    public Account(int accountNumber,double balance,String UserName,
    String Email,String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.UserName = UserName;
        this.Email = Email;
        this.phoneNumber = phoneNumber;

        System.out.println("We have called account constructor called");
    }



    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " +
                depositAmount + "made"+
                "New balance is" + this.balance);

    }

    public void withdrawal(double withdrawalAmount){
        if(balance - withdrawalAmount<= 0){
            System.out.println("Only" + withdrawalAmount +
                    "available.Withdrawal not processed");
        }else{
            balance -= withdrawalAmount;
            System.out.println("Withdrawal  of " + withdrawalAmount +
                    "processed"+"Remaining balance = " + balance );
        }
    }


    private int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    private double getBalance(){

        return balance;
    }

    public void setBalance (double balance){
        this.balance = balance;
    }

    private String getUserName() {
        return UserName;

    }

    public void setUserName(String UserName){
        this.UserName = UserName;

        }

    private String getEmail(){
        return Email;
    }

    public void setEmail(String Email){
        this.Email = Email;
    }

    private String getphoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
