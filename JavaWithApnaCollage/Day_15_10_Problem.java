//Print the sum of number till it becomes a single Digit......
import java.util.Scanner;

public class Day_15_10_Problem {
    public static int sumOfDigit(int number){
        int sum = 0;
        while(number >0){
            sum += number%10;
            number = number/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the number you want perfornm the operation::");
        int number = scan.nextInt();

        while(number>=10){
            number = sumOfDigit(number);
        }

        System.out.println("The Single Digit will be: "+number);
    }
}
