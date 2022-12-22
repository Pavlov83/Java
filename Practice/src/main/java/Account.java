public class Account {

    private double balance;

    public Account(){
        this.balance = 0;
    }

    public void setBalance(double newBalance){
        this.balance = newBalance;
    }

    public double getBalance(){
        return this.balance;
    }

    public Account withdraw(double withdrawAmount){
        balance -= withdrawAmount;
        return this;
    }

}
