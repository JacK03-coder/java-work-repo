/*
 * Finally BLock-->>> the finally block contain's a code which is excute no matter what....!!
 * 
 */

class khjgg{
 public static int  sum(){

     
    try {
        int a = 24;
        int b = 0;
        int c = a/b;
        System.out.println(" Divide: "+c);
        return c;
        } 
    catch (Exception e) {
        System.out.println(e);
    }

    finally{
        System.out.println("It will execute no mattetr what..");
    }
    return 0;
    
 }

}
public class Day_30_09_02 {
    public static void main(String[] args) {
        khjgg jg = new khjgg();
        jg.sum();


    }
}
