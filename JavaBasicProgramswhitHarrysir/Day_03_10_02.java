
import java.util.ArrayDeque;

/*
 * ArrayDequeue!-->> 
 */
public class Day_03_10_02 {
    public static void main(String[] args) {
     ArrayDeque<Integer> MyArrayDeque = new ArrayDeque<>();
     //<<--ArrayDeque Method's-->>

     MyArrayDeque.add(1);
     MyArrayDeque.add(2);
     MyArrayDeque.add(3);
     MyArrayDeque.add(4);
     MyArrayDeque.add(5);
     MyArrayDeque.addFirst(0);
     
     System.out.println(MyArrayDeque);
     System.out.println(MyArrayDeque.getFirst());
     System.out.println(MyArrayDeque.clone());
     System.out.println(MyArrayDeque.getLast());
    }
}
