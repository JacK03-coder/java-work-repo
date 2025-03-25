
import java.util.Scanner;

public class Day_25_10_BitManipulation {

    // Method to check if a digit is even or odd........
    public static void evenOrOdd(int num){
        int bitMask = 1;

        if((num & bitMask) ==  0 ){
            System.out.println("Number is even..");
        }else
            System.out.println("number is odd");
    }
    public static void main(String[] args) {
        //Binary AND
        System.out.println(5&6);
        //BInary OR
        System.out.println(5|6);
        //Binary XOR
        System.out.println(5^6);
        //Binary one's complement
        System.out.println(~5);
        //Binary Left-Shift
        System.out.println(5<<2);
        //Binary Right-Shift
        System.out.println(6>>1);

        //check if a number is odd or even....

        evenOrOdd(4);
        evenOrOdd(7);
    }
}
