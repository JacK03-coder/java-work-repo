/*
 * In this code multiple method's are created each have their own work and propertie's and the main thing is that they use each other to perform thier task.. [sbka sath sbka vikash]
 */

import java.util.Scanner;

class printSum{
    //0.Method with return value Integer type...
    public   int sum(int a , int b){
        return a+b;
    }
}
public class Day_06_10_method {
    // 1.method with no return type [void]...
        public static void printHelloWorld(){
            System.out.println("Hello,world!");
            System.out.println("Hello,world!");
            System.out.println("Hello,world!");
        }

        //2.for multipling two number's....
        public static int multiply(int x , int y){
            int product = x*y;
            return product;

        }

        //3.for factorial of a number....
        public static int factorial(int n){
            if(n==0 ||n ==1){
                return 1;
            }
            else 
               return  n*factorial(n-1);
        }

        //4.for Binomial Cofficient....
        public static int bincoffi(int n , int r){
            int n_fact = factorial(n);
            int r_fact = factorial(r);
            int nar_fact = factorial(n-r);
            
            return n_fact/(r_fact*nar_fact);  
        }

        //5.Check a number is Prime or not .....
        public static boolean  checkprime(int num){
            if(num==2){
                return true;
            }
            for(int i = 2 ; i<=num-1 ; i++){
                if(num%i==0){
                     return false;
                    
                }
            }
            return true;
        }

        //6. Print primary number till given value....
        public static void PrimeInRange(int n){
            for(int i = 2 ; i<=n ; i++){
                if(checkprime(i)){
                    System.out.println(i);
                }
            }
        }

        //7. Convert Binary to Decimal number....
 
        public static void binToDec(int binNum){
            int mybinNum = binNum;
            int pow = 0;
            int decNum = 0;

            while(binNum>0){
                int lastDigit = binNum%10;
                decNum += lastDigit * Math.pow(2, pow);
                pow++;
                binNum = binNum/10;
            }
            System.out.println("The Binary Number "+mybinNum+" Decimal number is : "+decNum);
        }

        //8. Convert Decimal to Binary...
         
        public static void decToBin(int decNum){
            int binNum = 0;
            int pow = 0;
            int decNum1 = decNum;
            
            while(decNum>0){
                int rem = decNum%2;
                binNum = binNum + (rem *(int)Math.pow(10 ,pow));
                pow++;
                decNum = decNum/2;
            }
            System.out.println("The Decimal number "+decNum1+"  Binary Number is : "+ binNum);
        }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
    //0. even i forget why i write this but i write this so i am not deleting it cause if a write so i guess i definatly have purpose that time....

    //    // System.out.println(printSum.sum(4,6));
    //    printSum psum = new printSum();
    //    System.out.println(psum.sum(5, 6));

    //     //1.
    //   printHelloWorld();

    //   //2.
    //   int x = 8; 
    //   int y = 3;
    //   int prod = multiply(x, y);
    //   System.out.println(prod);

    //   //3.
    //   System.out.println("Enter the number you want  factorial of: ");
    //   int n = scan.nextInt();
    //   System.out.println("the factorial of the number is :"+factorial(n));

    // //4. 
    // System.out.println("the Binomial cofficient is: "+bincoffi(5, 3));


    //5.
    //System.out.println(checkprime(19));

    //6.
    // PrimeInRange(20);

    //7.
    binToDec(101);

    //8.
    decToBin(5);
    }
}
