import java.rmi.server.ServerNotActiveException;
import java.util.Scanner;

public class time_pass {
    static int n1= 0, n2=1, n3=0;
    public static void main(String[] args) {
        System.out.println("Printing Fabonacci Series...\n");
        int count = 15;
        System.out.print(n1+" "+n2);
        FibonacciSeries(count-1);
    }
    static void FibonacciSeries(int count){
        if(count>0){
            n3=n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            FibonacciSeries(count-1);
        }

    }

    //Without Rcursion..........
       static class A{
        int n1=0 , n2 = 1 , n3 , count = 50;
        void Fibonacciseries() { 
        System.out.println("Printing Fabonacci Series..!");
        System.out.println();
        System.out.print(n1+" "+n2);
        for(int i=2;i<=count ; i++){
                    n3 = n1+n2;
                    System.out.print(" "+n3);
                    n1 = n2;
                    n2 = n3;
        
                }      
            }
        }
}

