/*
 * Basic code related to Thread's and uase basic Thread method like getPriority() , sleep() , getstate , currentstate()[Thread.currentThread()]...
 */
class thr12 extends Thread{
    public void run(){
        int i =1;
        while(i<100){
        System.out.println("Good Morning");
        i++;
        }
    }
}
class thr13 extends Thread{
    public void run(){
        int j =1;
        while(j<100){
            try{
                Thread.sleep(30);
            }
             catch(Exception e){
                System.out.println(e);
             }
        System.out.println("Welecome");
        j++;
        }
        
    }
}
public class Day_28_09_03 {
    public static void main(String[] args) {
        thr12 th12 = new thr12(); 
        thr13 th13 = new thr13();
        th12.setPriority(Thread.MAX_PRIORITY);
        th13.setPriority(Thread.MIN_PRIORITY);
        System.out.println(th12.getPriority());
        System.out.println(th13.getPriority());
        System.out.println(th12.getState());
        th12.start();
        th13.start();
        System.out.println(th12.getState());
    }
}
