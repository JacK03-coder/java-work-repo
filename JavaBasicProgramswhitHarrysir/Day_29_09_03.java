/*
 * So this code demonstrate that how the try & catch works also what's the importance they have ...
 * So basically the code execute's line by line so you see if you run an code to divide an number by something if there is somehow an error occure or the line throw an error
 * the whole program will stop... compiler also not run other line ..
 * so basically try and catch help us to run the code and give if an error occuring in a line and run other line which are avalaible in the code...
 * like in the given code it throw the error if we give any incorrect input an run other line too.... 
 * do not stop running the whole code..
 */
import java.util.Scanner;

public class Day_29_09_03 {
    public static void main(String[] args) {
        int [] arr ={7,75,45};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int ind = scan.nextInt();
        System.out.println("Enter the the number you want to divide the array value with: ");
        int num = scan.nextInt();
       // System.out.println(arr[ind]/num);
        try {
                System.out.println("The value of array index is : "+arr[ind]);
                System.out.println("The value of array-value/num is : "+arr[ind]/num);
        } catch (Exception e) {
            System.out.println("some exception occure!");
            System.out.println(e);
        }

        System.out.println("hello");
    }
}
