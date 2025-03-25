/*
 * Using nested try-catch block with while loop......
 */
import java.util.Scanner;

public class Day_29_09_05 {
    public static void main(String[] args) {

        int [] arr = {556,65,66,65,6,56,56};
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while(flag){
        System.out.println("Enter the index number:");
        int ind = scan.nextInt();
            try {
                System.out.println("Nothing");
               
                  try {
                      System.out.println("the elemet is in the index you enterd::"+arr[ind]);
                      flag = false;
                
                 }     catch (ArrayIndexOutOfBoundsException e) {
                             System.out.println("this index does not exist!");
                              System.out.println("Excption in level 2.. nested try- catch On duety..!");
                }

             } catch (Exception e) {
                  System.out.println("Exception in  level 1 ");
            }
        }
        
    }
}
 