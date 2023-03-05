package linkedlists;

public class Customer {
    private String name;
    private  double balance;

    public double getBalance(){
        return this.balance;
    }

    public String getName(){
        return this.name;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setName(String name){
        this.name = name;

    }

    public  Customer(String name,double balance){
        this.name = name;
        this.balance = balance;
    }




}
