
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;


class DelayedTask implements Delayed{

    private final String taskName;
    private final long startTime;

        public DelayedTask(String taskName , long delay , TimeUnit unit){
            this.taskName = taskName;
            this.startTime = System.currentTimeMillis() + unit.toMillis(delay);
        }

        
    @Override
    public int compareTo(Delayed o) {
        if(this.startTime < ((DelayedTask)o).startTime){
            return -1;
        }
        if(this.startTime > ((DelayedTask)o).startTime){
            return 1;
        }
       return 0;
    }

    @Override
    public long getDelay(TimeUnit unit) {   
        long remaining = startTime - System.currentTimeMillis();
        return unit.convert(remaining,TimeUnit.MILLISECONDS);
    }

    public String getName(){
        return taskName;
    }

}
public class DelayQueueDemo { 
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<DelayedTask> delayQueue = new DelayQueue<>();

        delayQueue.put(new DelayedTask("Task-1", 7, TimeUnit.SECONDS));
        delayQueue.put(new DelayedTask("Task-2", 3, TimeUnit.SECONDS));
        delayQueue.put(new DelayedTask("Task-3", 9, TimeUnit.SECONDS));
        delayQueue.put(new DelayedTask("Task-4", 1, TimeUnit.SECONDS));
        delayQueue.put(new DelayedTask("task-5", 13, TimeUnit.SECONDS));

        while(!delayQueue.isEmpty()){
            DelayedTask task = delayQueue.take();
            System.out.println("Executed: "+task.getName() + "  at :: "+ System.currentTimeMillis());
        }
    }
}
