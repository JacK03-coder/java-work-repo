package mythread.secondthreadmethod;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairLockExample {
    // by Default it is unfair like it have a Arbitrary order , but we can pass true in the parameter so that it follow an Order in which it have requested and do execute the 
    // code in a proper Order....by just passing true in thee parameter of the ReentrantLock(True)...  :)
    private final Lock unfairlock = new ReentrantLock(true);

    public void accessResource(){
        unfairlock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+ "   Acquired the lock...");
            Thread.sleep(3000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }finally{
            unfairlock.unlock();
            System.out.println(Thread.currentThread().getName()+"   Release the lock...");
        }
    }
}
