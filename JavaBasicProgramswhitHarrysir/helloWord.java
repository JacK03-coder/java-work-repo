
import java.util.Scanner;

public class helloWord {

    static int printSum(String name){
        int sum = 0;

        for(int i = 0; i<name.length();i++){
            char c = name.charAt(i);
            if(Character.isDigit(c)){
                sum += Character.getNumericValue(c);
            }
        }   return sum;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String name = scan.next();
        System.out.println("The sum of number in string is : "+printSum(name));
    }
}
