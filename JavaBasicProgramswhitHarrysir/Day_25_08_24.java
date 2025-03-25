
import java.util.Scanner;

public class Day_25_08_24 {
    public static void main(String[] args) {
    //Sum of even number using while loop....!!!!
         Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want sum of : ");
        int Num = scan.nextInt();
        int sum = 0;
        for(int i=0;i<=Num;i++){
            sum = sum +(2*i);
        }
        System.out.println("The sum is: "+sum);
        //Print table of any NUmber....!!!!!!
        // System.out.println("Enter the number you want table of : ");
        // int num = scan.nextInt();
        // for(int i=1;i<=10;i++){
        //     System.out.printf("%d X %d = %d \n", num ,i , num*i); 
        // }
    }
}
