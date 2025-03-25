
import com.sun.source.doctree.LiteralTree;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Collections;
import java.util.List;

public class Day_22_11_ArrrayList {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        //------------Basic Operation's--------------
        // list.add(4);
        // list.add(5);
        // list.add(6);
        // System.out.println(list);
        // System.out.println(list.get(0));
        // list.remove(0);
        // System.out.println(list);

        // list.set(1, 8989);
        // System.out.println(list);

        // System.out.println(list.contains(4));
        // System.out.println(list.contains(5));

        // list.add(1);
        // list.add(2);
        // list.add(333);
        // list.add(4);
        // list.add(5);
        // list.add(9898);
        // System.out.println(list);

        // // print Array List 
        // for(int i=0; i<list.size() ; i++){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();

        // // print Array List in Reverse......
        // for(int i = list.size()-1 ; i>=0 ; i--){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();

        // int max = Integer.MIN_VALUE;

        // for(int i=0; i<list.size() ; i++){
        //     // if(max<list.get(i)){
        //     //     max = list.get(i);
        //     // }

        //    max = Math.max(max, list.get(i));
        // }
        // System.out.println("Largest Element is : "+max);


        // // sort and ArrayList using Collection Class......
        // // by default print in ascending Order...
        // System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);

        // // for decending Order....

        // Collections.sort(list , Collections.reverseOrder());
        // System.out.println(list);

        //2D Array List....

        ArrayList<ArrayList<Integer>> mainlist  = new ArrayList<>();

        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(1);
        // list1.add(2);
        // list1.add(3);
        // mainlist.add(list1);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(4);
        // list2.add(5);
        // list2.add(6);
        // mainlist.add(list2);

        // ArrayList<Integer> list3 = new ArrayList<>();
        // list3.add(7);
        // list3.add(8);
        // list3.add(9);
        // mainlist.add(list3);

        // for(int i = 0 ; i<mainlist.size() ; i++){
        //     ArrayList<Integer> currlist = mainlist.get(i);
        //         for(int j=0 ; j<currlist.size() ; j++){
        //             System.out.print(currlist.get(j)+" ");
        //         }
        //         System.out.println();
        // }
        // System.out.println(mainlist);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // int k =1;
        // for(int i=0 ; i<5 ; i++ , k++){
        //     list1.add(i, k);
        // }
        // System.out.println(list1);

        // k =2;
        // for(int i=0; i<5 ; i++ , k+=2){
        //     list2.add(i,k);
        // }
        // System.out.println(list2);

        // k =3;
        // for(int i=0 ; i<5 ; i++ , k+=3){
        //     list3.add(i, k);
        // }
        // System.out.println(list3);

        for(int i=1; i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        
        System.out.println(mainlist);

        for(int i=0 ; i<mainlist.size() ; i++){
            ArrayList<Integer> currlist = mainlist.get(i);

            for(int j=0; j< currlist.size() ; j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
    }
}
 