
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.swing.text.ViewFactory;

public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.isEmpty();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        System.out.println(vector.capacity());
        System.out.println(vector);
        vector.add(11);
        System.out.println(vector.capacity());
        System.out.println(vector);

        vector.add(0,33);
        vector.set(7, 777);
        vector.remove(5);
        System.out.println(vector.size());
        System.out.println(vector);

        System.out.println(vector.get(6));

        System.out.println(vector.isEmpty());

        vector.clear();
        System.out.println(vector.isEmpty());

        System.out.println(vector);



        // Thread Working with LinkedList...
      //  LinkedList<Integer> linkedList1 = new LinkedList<>();

      // Thread Working with Vector...
        Vector<Integer> linkedList1 = new Vector<>();

        Thread t1 = new Thread(()->{
            for(int i=0; i<1000 ; i++){
                linkedList1.add(i);
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i< 1000; i++){
                linkedList1.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Size Of The List: "+linkedList1.size());
    }
}
