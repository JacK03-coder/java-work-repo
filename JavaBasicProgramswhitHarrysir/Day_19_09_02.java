

/*
 * so here we are working on Thread by implementing Runnable interface it is the second type to create Thread...
 * so basiclly here we have to create class and implement  Runnable on it , just like we extends Thread before and I don't know why..
 * but maybe it is structure or way to create Thread....
 * their something more we have to work on ....so we have to create object's of created class's and it's not enough we can create Thread by this....
 * after that we have to create an new object of Thread and in that we have to pass the object's of Runnable class and then use the start(); method
 * without it we can't use the Runnable classes i don't know  i explained it properly or not i give my best this is whatever i can right now....
 * and if you don't understand's it you can check the code you definatly get the concept i am expalinning here......
 */
class mythread4 implements Runnable{
    public void run(){
        System.out.println("i am Bullet from  thread4...");
    }
}

class mythread5 implements Runnable{
    public void run(){
        System.out.println("i am Bullet from  thread5...");
    }
}

public class Day_19_09_02 {
    public static void main(String[] args) {
       mythread4 bullet1 = new mythread4();
       Thread gun1 = new Thread(bullet1);

       mythread5 bullet2 = new mythread5();
       Thread gun2 = new Thread(bullet2);

       gun1.start();
       gun2.start();

       
    }
}
