
import java.security.DrbgParameters;
import java.util.Scanner;

public class randomhicfhis {
    static int factorial(int num){
        if(num==0||num==1){
           return 1;
        }
            return num * factorial(num-1);
    }

    static int factorial_itrative(int num){
       int  fact = 1;
        if(num ==0 ||num ==1){
            return 1;
        }else {
            for(int i=1;i<=num ; i++){
                fact *=i;
            }
        }return fact;
    }
     static int n1 =0 , n2 =1 , n3 ;
    static void fabonnaci_series(int count){
         if(count>0){
                n3 = n1+n2;
                n1 = n2;
                n2 = n3;
                System.out.println(" "+n3);
                fabonnaci_series( count-1);
         }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want factorial of : ");
        int num = scan.nextInt();
        System.out.println("Factorial of the number using recursion: "+factorial(num));
        System.out.println("Factorial of the number is using itrative method is : "+factorial_itrative(num));
        System.out.println("Enter the number you want Fabonnaci Series of : ");
        int count = scan.nextInt();
        System.out.println(" "+n1+"\n "+n2);
        fabonnaci_series(count-1);
        System.out.println("Enter the new number: ");
        int man = scan.nextInt();
        int n4;
        System.out.println(n1+" "+n2); 
        for(int i= 2 ; i< man ; i++){
            n4 = n1 + n2;
            System.out.println(" "+n4);
            n1 = n2; 
            n2 = n3;
        }
        
    }
}
