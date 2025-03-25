/* NOTE-->>>when we create multiple thread in a java program , In that situation JVM get an [Ready Queue] inside that Ready Queue we have all the thread which are ready to run....
also the Ready Queue is maintained by JVM...  like example if we have T1 , T2 and T3 Thread in the Ready Queue the responsibilty is JVM's to run all the Thread ,
JVM have an Thread Sedular component , the component  maintained all the Thread's and help them to run..-->>
 * !!--Thread Priorities--!! 
 */


 class Mythr extends Thread{
   public Mythr(String name){
        super(name);
    }

    public void run(){
        int i = 1;
        while(i<100){
        System.out.println("Noting  "+this.getName());
        i++;
        } 
    } 
 }
public class Day_28_09_02 {
    public static void main(String[] args) {
        Mythr thr1 = new Mythr("jack1");
        Mythr thr2 = new Mythr("jack2");
        Mythr thr3 = new Mythr("jack3");
        Mythr thr4 = new Mythr("jack4");
        Mythr thr5 = new Mythr("jack5");
        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        thr5.start();
    }
}
