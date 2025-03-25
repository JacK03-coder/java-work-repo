
/*
 * LinkedList-->> linked list & it's comman method's. I know what is LInkedList so right now i am  not writing about it anything what is LinkedList is...!!!!!
 */
import java.util.*;

public class Day_03_10 {
    public static void main(String[] args) {
        LinkedList <Integer> MylinkLinkedList = new LinkedList<>();
        MylinkLinkedList.add(1);
        MylinkLinkedList.add(2);
        MylinkLinkedList.add(3);
        MylinkLinkedList.add(4);
        MylinkLinkedList.add(5);
        MylinkLinkedList.add(6);
        MylinkLinkedList.add(7);
        MylinkLinkedList.add(8);
        MylinkLinkedList.add(9);
        MylinkLinkedList.add(10);

        System.out.println(MylinkLinkedList);

        //<<<<-----LinkedList Method--->>>> 
        MylinkLinkedList.add(45);
        System.out.println(MylinkLinkedList);
        MylinkLinkedList.remove(0);
        System.out.println(MylinkLinkedList);
        MylinkLinkedList.addFirst(1);
        System.out.println(MylinkLinkedList);
        MylinkLinkedList.addLast(69);
        System.out.println(MylinkLinkedList);
        MylinkLinkedList.add(5,106);
        System.out.println(MylinkLinkedList);
        MylinkLinkedList.clear();
        System.out.println(MylinkLinkedList);

    }
}
