
import java.util.Scanner;
public class formidterm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scan.nextLine();

        int spaceIndex = name.indexOf(' ');

        String name1 = name.substring(0,spaceIndex);
        String name2 = name.substring(spaceIndex+1);

        for(int i = 0 ; i<name1.length(); i++){
            for(int j =0 ; j<=i ;j++){
                System.out.print(name1.charAt(j));
            }
            System.out.println();
        } 
        
        for(int i = 0 ; i<name2.length() ;i++){
            for(int j=0 ; j<name2.length()-i ; j++){
                System.out.print(name2.charAt(j));
            }System.out.println();
        }
    }
}
