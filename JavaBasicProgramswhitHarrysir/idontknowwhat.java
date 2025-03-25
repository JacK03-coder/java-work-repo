import java.util.*;
public class idontknowwhat {

public class Factorial{
static int  factorial(int num){
    if(num==1 ||  num==0){
        return 1;
    }
    else
       return num*factorial(num-1);
}

static int factorial_itrative(int num){
    int sum = 1;
    if(num==1 ||  num==0){
        return 1;
    }
    for(int i = 1 ; i<=num ;i++){
        sum *= i;
    }
    return sum;
}

}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        System.out.println("The factorial of the number bt recursion: "+Factorial.factorial(num));
        System.out.println("The factorial of the number by Itrative Method: "+Factorial.factorial_itrative(num));
    }
}
