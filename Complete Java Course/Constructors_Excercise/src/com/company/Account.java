package com.company;

public class Account {

    private int accountNumber;
    private double balance;
    private String UserName;
    private String Email;
    private String phoneNumber;


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
