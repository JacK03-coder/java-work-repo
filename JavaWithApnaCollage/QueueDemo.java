
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);

        System.out.println(queue1);
        System.out.println(queue1.remove());
        System.out.println(queue1.poll());
        System.out.println(queue1);
    }
}
