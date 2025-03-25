package mythread.secondthreadmethod;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int  balance = 1000;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + "Attempting to withdraw..." + amount);
        try{
            if(lock.tryLock(1000,TimeUnit.MILLISECONDS)){
                if(balance >= amount){
                    try{
                        System.out.println(Thread.currentThread().getName() + "Proceeding to withdraw...");
                        Thread.sleep(3000);   // Simulate time taken to process the withdrwal... 
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + "Complated Withdrwal  , Remaining Balance:::"+ amount);
                    }
                        catch(InterruptedException e){
                        }
                    finally{
                        lock.unlock();
                    }
            
                }else{
                    System.out.println(Thread.currentThread().getName() + "isufficient Balance...");
                }

            }else
                System.out.println(Thread.currentThread().getName() +"Could not acquire the lock , will try later...");

        }catch(Exception e){
        }
    }
}
