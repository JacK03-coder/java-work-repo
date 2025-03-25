
import java.util.Scanner;

/*
 *  This is an intersting progam it takes an input name from the user and print every after alphabate from the string...
 * like if you have entered a name jay it will give you output kba ...cause z is last alphabate  so it print again a ....
 */

public class Day_30_09_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.println("Enter  your name: ");
        String name = scan.next();
        String name2 = "";

        for(int i =0 ; i<name.length() ; i++){
            char value = name.charAt(i);
            if(value== 'z'){
              name2 = name2+'a';  
            }
            else
             name2 = name2+(char)(value+1);
        } 
        System.out.println(name2);
    }
}
