
import java.util.Scanner;

public class Day_01_09 {
    static int CalculateFactorial(int n){
        if(n==0){
            return 1;
        }
        return n * CalculateFactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter The Numnber you want to factorial of : ");
        int value = scan.nextInt();
        long factorial = CalculateFactorial( value);
        System.out.println("The facgtorial of : "+value+" is:"+factorial);
    }
 }

