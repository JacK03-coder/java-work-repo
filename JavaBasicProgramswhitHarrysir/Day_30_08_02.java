import java.util.*;
public class Day_30_08_02 {

    //Creating Method's in Java.............

        static int Random(int x, int y){
            int z = x*y;
            return z;
        }

        static int MySum(int a , int b){
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {
        int a =56;
        int b =65;
       // Day_30_08_02  A = new  Day_30_08_02(); :::::: if we are not using static .we can also create an object ...To use Method...
       int n = MySum(a,b);
       System.out.println(n);

       int k =3;
       int l = 4;
       int d = Random(3, 4);
       System.out.println(d);
    }
}
