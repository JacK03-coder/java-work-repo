
/*Try and Catch -->> Excaption handling */
import java.util.Scanner;

public class Day_29_09 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double a = 3000;
    System.out.println("Enter a value");
    double b = scan.nextInt();
      try{
        double c = a/b;
        System.out.println(c);
     } catch(Exception e){
        System.out.println("AN error occour::");
        System.out.println(e);
     }

    }
}
