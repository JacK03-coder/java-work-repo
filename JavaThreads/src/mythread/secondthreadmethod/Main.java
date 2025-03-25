package mythread.secondthreadmethod;

public class Main {
    public static void main(String[] args) {
        // BankAccount UGB = new BankAccount();

        // Runnable task = new Runnable() {
        //     @Override
        //     public void run() {
        //         UGB.withdraw(500);
        //     }
        // };
        // Thread t1 = new Thread(task," Thread-1");
        // Thread t2 = new Thread(task,"Thread-2");
        // Thread t3 = new Thread(task,"Thread-3");

        // t1.start();
        // t2.start();
        // t3.start();

        UnfairLockExample example = new UnfairLockExample();

        Runnable task = new Runnable() {
            @Override
            public void run(){
                example.accessResource();
            }
        };

        Thread t1 = new Thread(task,"Thread-1");
        Thread t2 = new Thread(task,"thread-2");
        Thread t3 = new Thread(task,"Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
} 
  