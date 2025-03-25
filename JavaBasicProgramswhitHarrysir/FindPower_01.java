
import java.util.Scanner;

public class FindPower_01 {
    public static void main(String[] args) {
        System.out.println("Find POwer..");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        int a = scan.nextInt();
        System.out.print("Enter the power:  ");
        int b = scan.nextInt();
        A x = new A();
        int k = x.pow(a,b);
        System.out.println("The final value is:  ");
        System.out.println(k);

    }

    static class A{
        int pow(int m ,int n )
        {
             if (n==0) {
             return 1;
            }
             else {
            return 
              m *pow (m,n-1);
           }
        }
    }
}
