import java.util.Scanner;

public class YouAreWrong {

    static int Factorial(int num){
        if(num==0||num==1){
            return 1;
        }else
             return num * Factorial(num-1);
    }

    static int Factorial_itrative(int num){
        int fact=1;
        if(num==1||num==0){
            return 1;
        } for(int i =1 ; i<=num ; i++){
            return fact*=i;
        }
        return fact;
    }   

    static int PrintSum(String s){
        int sum = 0;
        for(int i = 0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                sum +=Character.getNumericValue(c);
            }
        }return sum;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Proving Someone Wrong.....i don't know why...!!!");
        System.out.println("Enter the number you  want factorial of: ");
        int num = scan.nextInt();
        System.out.println("The factorial is using Recursion : "+Factorial(num));
        System.out.println("Factorial  is using Itrative method: "+Factorial_itrative(num));
        String s = "helo6lo6lo6";
        System.out.println("The sum of Digit avalable in the string is : "+PrintSum(s));
    }
}
