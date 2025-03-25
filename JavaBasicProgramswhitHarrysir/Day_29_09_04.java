/*
 * try-catch block with multiple catch block......
 */
import java.util.Scanner;

public class Day_29_09_04 {
    public static void main(String[] args) {
          int [] arr ={7,75,45};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int ind = scan.nextInt();
        System.out.println("Enter the the number you want to divide the array value with: ");
        int num = scan.nextInt();

        try {
            System.out.println(arr[ind]/num);
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException occour");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occour");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("an Exception occour");
            System.out.println(e);
        }
        
    }
}
