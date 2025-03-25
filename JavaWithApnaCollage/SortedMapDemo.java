
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer,String> list = new TreeMap<>();
        list.put(2,"Thor");
        list.put(5, "loki");
        list.put(8 ,"Tony");
        list.put(4 ,"Black panther");
        list.put(9,"Hulk");
        list.put(5, "Howkeye");
        
        System.out.println(list);

        System.out.println(list.firstKey());
        System.out.println(list.lastKey());
        System.out.println(list.headMap(5));
        System.out.println(list.tailMap(8));
        System.out.println(list.subMap(2, 5));
        

        

    }
}
