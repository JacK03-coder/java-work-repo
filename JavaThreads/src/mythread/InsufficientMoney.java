package mythread;

public class InsufficientMoney extends  Exception{
    private double amount;

    public InsufficientMoney(double amount){
        super( "Paisa nhi hai you don't have enough money");
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }
}
