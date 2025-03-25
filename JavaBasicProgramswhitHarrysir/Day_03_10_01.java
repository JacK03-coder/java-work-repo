
import java.util.HashSet;

/*
 * HassingTechnique-->> It is a technique used to access or retrive element very fastly & efficintly....
 * In this we assign an hash value to every element by the help of  Hash function...So simple.
 */
public class Day_03_10_01 {
    public static void main(String[] args) {
        HashSet<Integer> MyHashSet = new HashSet<>();
        MyHashSet.add(1);
        MyHashSet.add(2);
        MyHashSet.add(3);
        MyHashSet.add(4);
        MyHashSet.add(5);
        MyHashSet.add(5);
        MyHashSet.add(3);
        System.out.println(MyHashSet);
        

    }
}
