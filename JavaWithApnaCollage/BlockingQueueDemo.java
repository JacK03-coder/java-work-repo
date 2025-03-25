
import com.sun.jdi.Value;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;


class Producer implements Runnable{
    private BlockingQueue<Integer> queue;
    private int value = 0;

        public Producer(BlockingQueue<Integer> queue){
            this.queue = queue;
        }

    @Override
    public void run() {
        while(true){
            try {
                System.out.println("Producer produced value : "+ value);
                queue.put(value++);
                Thread.sleep(500);
                
            } catch (Exception e) {
                System.out.println("An Exception occure");
            }
        }
    }
}

class Consumer implements Runnable{
    private BlockingQueue<Integer> queue;
        public Consumer(BlockingQueue<Integer> queue){
            this.queue = queue;
        }

    @Override
    public void run() {
        while(true){
            try {
                Integer value = queue.take();
                System.out.println("Consumer consumed value: "+value);
                Thread.sleep(1000);
            }
            catch (Exception e) {
                System.out.println("An Exception occure....");
            }
        }
    }
        
}
public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        
        // producer.start();
        // consumer.start();


        BlockingQueue<Integer> queue1 = new LinkedBlockingQueue<>(11);

        BlockingQueue<String> queue2 = new PriorityBlockingQueue<>(13, Comparator.reverseOrder());
        queue2.add("Hulk");
        queue2.add("Thor");
        queue2.add("Loki");
        queue2.add("Tony");
        
        
        System.out.println(queue2);

        for(String str: queue2){
            System.out.println(str);
        }
    }
}
 