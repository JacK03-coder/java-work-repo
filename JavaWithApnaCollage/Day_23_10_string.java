import java.lang.reflect.Array;
import java.util.Scanner;

public class Day_23_10_string {
    public static boolean checkPalindrome(String name){
        for(int i=0 ; i<name.length() ; i++){
            if(name.charAt(i)!=name.charAt(name.length()-i-1)){
               return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter An String: ");
        String name = scan.next();
        System.out.println(checkPalindrome(name));
        
        // String name2 = new String();

        // for(int i = name.length()-1 ; i>=0 ; i--){
        //     name2 += name.charAt(i);
        // }

        // if(name2.equals(name)){
        //     System.out.println("String is Palindrome!");
        // }else
        //     System.out.println("String is Not Palindrome!");

    }
}
