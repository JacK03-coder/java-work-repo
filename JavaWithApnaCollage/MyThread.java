package mythread;
/*
 * About Thread:::srtart() [to start the thread] | sleep() [make thread to wait for a given time] | join()[use to pause the execution of the current thread until the thread on which the join() is called has finished executing]
                  
                    Set Priority() :: [set priority of the execution of the thread by using priority() method]

                   interrupt() ::  intrrupt the thread and send a signal to thread and it is up to the thread to terminate  it or run it...
                   [If the thread is running, interrupt() does not stop it but signals it to stop by setting the interrupt flag.
                   The thread has to check the flag and decide to terminate or continue.
                  If the thread is sleeping or waiting, interrupt() wakes it up by throwing an InterruptedException, 
                  allowing the thread to handle the interruption.]

                  yield() :: give an hint to the scheduler to give chance to other Thread's to ....

                  Deamon() :: A deamon thread is a background thread that provides service to other thread  or the system.. unlike the 
                             the user threads ,the JVM terminatedeamon threads automatically when all user thread have completed execution...
 */

public class MyThread extends Thread{

    MyThread(String name){
        super(name);
    }


    // for Priority...

    // @Override
    // public void run() {
    //     for(int i =0 ; i<= 9; i++){
    //             System.out.println(Thread.currentThread().getName()+"-Priority: "+Thread.currentThread().getPriority() +" -Count: " + i);
    //             try{
    //                 Thread.sleep(1000);
    //           }
    //         catch(InterruptedException e){
    //                  System.out.println(e);
    //          }
    //     }
       
    // }


    // for interrupt()...

    // @Override
    // public void run() {
    //     try{
    //         Thread.sleep(1000);
    //         System.out.println("Hello");
    //     }catch(InterruptedException e){
    //         System.out.println("Interrupted Error : "+ e);
    //     }
        
    // }


    // for yield...
    // @Override
    // public void run() {
    //    for(int i =0 ; i<=50; i++){
    //      System.out.println(Thread.currentThread().getName() +"    Running...");
    //      Thread.yield();
    //    }
    // }

    // Deamon thread...
    @Override
    public void run() {
      while(true){
        System.out.println("JAcK !!!");
      }
    }
    public static void main(String[] args) throws InterruptedException {
        // MyThread l1 = new MyThread("Low Priority Thread");
        // MyThread m1 = new MyThread("Medium Priority Thread");
        // MyThread h1 = new MyThread("High Priority Thread"); 

        // m1.start();
        // h1.start();
        // l1.start();      
        
    //     MyThread t1 = new MyThread("Jay");
    //     t1.start();
    //    t1.interrupt();

    // MyThread t1 = new MyThread("t1");
    // MyThread t2 = new MyThread("t2");
    
    // t1.start();
    // t2.start();

    MyThread t1 = new MyThread("jay");
    t1.setDaemon(true);
    t1.start();
    System.out.println("MAin DOne!!");

    }
} 