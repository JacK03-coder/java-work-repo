
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {


        // Linked List & some basic Method's Of Linked list...
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.removeIf(x->x%2==0);
        System.out.println(linkedList);

        linkedList.add(0,4);
        linkedList.addFirst(10);
        linkedList.addLast(100);
        linkedList.remove(4);
        System.out.println(linkedList);
 
        linkedList.removeIf(x->x%2==0);
        System.out.println(linkedList);


        LinkedList<String> animal= new LinkedList<>(Arrays.asList("Lion","Cat","Elephant","Dog","Fox","Wolf","KingFisher","Owl"));
        System.out.println(animal);
        LinkedList<String> animalTORemove = new LinkedList<>(Arrays.asList("Elephant","Owl","KingFisher"));
        animal.removeAll(animalTORemove);
        System.out.println(animal);

        // ArrayList<Integer> arrayList = new ArrayList<>();
        // LinkedList<Integer> linkedList = new LinkedList<>();

        // for(int i= 0; i<=100000 ; i++){
        //     arrayList.add(i);
        //     linkedList.add(i);
        // }

        // int findElement = 50000;

        // long aSTime = System.nanoTime();
        // System.out.println(arrayList.get(findElement));
        // long aETime = System.nanoTime();
        // System.out.println("Array List Access time : "+(aETime-aSTime)+"ns");
        
        // long  lSTIme = System.nanoTime();
        // System.out.println(linkedList.get(findElement));
        // long lETime = System.nanoTime();
        // System.out.println("Linked List Access Time : "+(lETime-lSTIme)+"ns");
    }
}