
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDdemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(23);
        pq.add(67);
        pq.add(45);
        pq.add(30);
        pq.add(78);
        pq.add(30);
        System.out.println(pq);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
