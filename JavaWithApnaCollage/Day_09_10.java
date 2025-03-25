import java.util.Scanner;

public class Day_09_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an string::");
        String str = scan.next();
        int length = str.length();

        for(int i = length-1 ; i>= 0 ; i--){
            for(int j= length-1-i ; j>=0 ; j--){
                System.out.print(str.charAt(j));
            }
        }
    }
}