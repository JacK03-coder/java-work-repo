
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.plaf.basic.BasicBorders;

/*
 * !ArrayList-->> Using basic method like add element  in the ArratList (and main how to create it) and add another collection's element in the ArrayList..
 *  how to get an specific index element and more...
 */
public class Day_02_10_02 {
    public static void main(String[] args) {
        ArrayList<Integer> MyArrayList = new ArrayList<>();
        ArrayList<Integer> MyArrayList1 = new ArrayList<>();
        MyArrayList1.add(5);
        MyArrayList1.add(6);
        MyArrayList1.add(7);
        MyArrayList1.add(8);
        MyArrayList.add(34);
        MyArrayList.add(56);
        MyArrayList.add(69);
        MyArrayList.add(106);
        MyArrayList.addAll(MyArrayList1);
        System.out.println(MyArrayList);
         // MyArrayList.clear();--->>> Remove all elemnet's from the list...
        //<<<<<<<<--------Method's------>>>>>>>>
        System.out.println(MyArrayList.get(4));
        System.out.println(MyArrayList.contains(79));
        System.out.println(MyArrayList.indexOf(69));
        System.out.println(MyArrayList.lastIndexOf(69));
        System.out.println(MyArrayList.remove(2));
        System.out.println(MyArrayList.set(4, 79));
        System.out.println(MyArrayList.isEmpty());
        System.out.println(MyArrayList.subList(2, 4));

    }
}
