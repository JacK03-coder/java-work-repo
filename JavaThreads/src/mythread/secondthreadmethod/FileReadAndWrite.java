package mythread.secondthreadmethod;

import java.io.IOException;
import java.nio.channels.InterruptedByTimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.management.RuntimeErrorException;
import org.w3c.dom.css.Counter;

public class FileReadAndWrite {
    private int count;

    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void increment(){
        writeLock.lock();
        try{
            count++;
            Thread.sleep(50);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        finally{
            writeLock.unlock();
        }
    }
    public int getCount(){
        readLock.lock();
        try{
            return count;
        }finally{
            readLock.unlock();
        }
    }

    public static void main(String[] args)  throws Exception{

        FileReadAndWrite counter = new FileReadAndWrite();


        Runnable readTask = new Runnable() {
            @Override
            public void run(){
                for(int i= 0 ; i<=10 ; i++){
                    System.out.println(Thread.currentThread().getName() + " read: " + counter.getCount());
                }
            }
        };
        Runnable writeTask = new Runnable() {
        
            @Override
            public void run(){
                for(int i=0 ; i<= 10 ; i++){
                    counter.increment();
                    System.out.println(Thread.currentThread().getName() + " Increment");
                }
            }
        };

        Thread writeThread = new Thread(writeTask);
        Thread readThread1 = new Thread(readTask);
        Thread readThread2 = new Thread(readTask);

        writeThread.start();
        readThread1.start();
        readThread2.start();

        writeThread.join();
        readThread1.join();
        readThread2.join();

        System.out.println("Final count : "+ counter.getCount());

    }
}
