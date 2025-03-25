import java.util.*;
public class herlofod {
    public static int factorial_recursive(int num){
        if(num==0||num==1){
            return 1;
        }
        else 
            return num*factorial_recursive(num-1);

    }

    public static int factorial_itrative(int num){
        int sum = 1;
        if(num==0||num==1){
            return 1;
        }
        for(int i =1 ; i<=num ; i++){
            sum*=i;
        }
        return sum;
    }
    

   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter The number you want factorial of : ");
    int num = scan.nextInt();
    System.out.println("The factorial of the number you enter : "+factorial_recursive(num));
    System.out.println("The factorial of the number using itrative method : "+factorial_itrative(num));
    System.out.println("Enter the number you want fabonnaci series of: ");
    int fnum =  scan.nextInt();
    int n1 =0 ;
    int n2 = 1;
    int n3 ;
    System.out.print(n1+" "+n2);
    for(int i = 0; i<=fnum ; i++){
        n3 = n1 + n2 ;
        System.out.print(" "+n3);
        n1 = n2;
        n2 = n3;
    }
   }
}
