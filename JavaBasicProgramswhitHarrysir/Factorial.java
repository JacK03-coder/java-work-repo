
import com.sun.source.doctree.AuthorTree;
import java.util.Scanner;
//finding factorial of numbers using Recursiv and Itrative method's
public class Factorial {
    static int Factorial(int n){
        if(n==0||n==1){
            return 1;
        } return n*Factorial(n-1);
    }
    static int factorial_itrative(int n){
        int product = 1;
        if(n ==0 || n==1){
            return 0; 
        }else 
            for(int i =1 ; i<=n ;i++){
                 product *=i;
            }
            return product;
        }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want factorial of: ");
        int number = scan.nextInt();
        System.out.println("The factorial of number you Entered is : "+Factorial(number));
        System.out.println("The factorial of 4 is: "+factorial_itrative(4));
    }
}
