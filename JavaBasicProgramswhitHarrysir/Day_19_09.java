
/*
 * Using Thread by extending Thread class... in this we have to just simply creat an class an extends it by Thread ... 
 * right now i don't know what is Thread is here but basically we have to use it like we do in inharitanc...
 * i much  i am  understanding it i guss the Thread is a already define and work as a parent class we don't have to crate it just use it...
 * but soon i have answer what it is......
 * after run the code you will  see the program execute's the method's simultaneously someting method first and somtime method second so this is what Threaad did...
 */

class MyThread1 extends Thread{
    public void run(){
        int j = 20;
        while(j<30){
        System.out.println("I am thread1");
        System.out.println(" I am working...");
        j++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i = 20;
        while (i<40) { 
            System.out.println("I am thread2");
            System.out.println("I am really running...");
            i++;
        }
    }
}

public class Day_19_09 {
    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1();
        MyThread2 th2 = new MyThread2();
        th1.start();
        th2.start();
    }
}


