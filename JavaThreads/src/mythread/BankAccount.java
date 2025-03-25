package mythread;

public class BankAccount {

    private double balance;
     
    BankAccount(double balance){
        this.balance = balance;
    }  

    void withdraw(double amount) throws InsufficientMoney {
        if(amount > balance){
            throw new  InsufficientMoney(amount);
        }
        balance -= amount;
    }
}
