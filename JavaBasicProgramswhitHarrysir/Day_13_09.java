
import java.awt.Choice;
import java.sql.PseudoColumnUsage;
import java.util.Scanner;
public class Day_13_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c ;
        do { 
            System.out.println("NOTE::::::\n You have Three Choice :: \n 1 for Addtion \n 2 for Substraction\n 3 for exit...");
            System.out.println("Enter Your Choice: ");
            c = scan.nextInt();


            switch (c) {
                case 1:
                    System.out.println("Enter First Number: ");
                    int a = scan.nextInt();
                    System.out.println("Enter Second Number: ");
                    int b = scan.nextInt();
                    System.out.println("The Sum is : "+(a+b));
                    break;
                 
                case 2: 
                    System.out.println("Enter First Number: ");
                    int m = scan.nextInt();
                    System.out.println("Enter Second Number: ");
                    int n = scan.nextInt();
                    System.out.println("The Substraction is : "+(m-n));
                    break;
                case 3:
                    System.out.println("Exiting Program...!");
                    break;
                default:
                    System.out.println("Enter Valid Number...");  
                
                }      
        }   while(c!=3); 
            
    }  
}