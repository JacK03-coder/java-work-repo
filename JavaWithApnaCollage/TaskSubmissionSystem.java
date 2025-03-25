
import java.util.concurrent.ConcurrentLinkedQueue;

public class TaskSubmissionSystem {
    private static ConcurrentLinkedQueue<String> taskQueue = new ConcurrentLinkedQueue<>(); 
    public static void main(String[] args) {
        
        Thread producer = new Thread(() ->{
            while(true){
                try{
                    taskQueue.add("task " + System.currentTimeMillis());
                }catch(Exception e){
                        System.out.println(e);
                }
            }
        });

        Thread consumer = new Thread(()->{
            while(true){
                try{
                    String task = taskQueue.poll();
                    System.out.println("Proceesing: "+task);
                }catch(Exception e){
                    System.out.println();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
