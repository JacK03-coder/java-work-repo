
import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;

public class Day_24_10_StringPro {
    // Fuction for Printing sub-String  From any String....
    // public static String subString(String str , int si , int ei){
    //     String newstr = "";
    //     for(int i = si; i<ei ; i++){
    //         newstr += str.charAt(i);
    //     }
    //     return newstr;
    // }

    // function for converting every first letter of any string into capital letter only first letter....

    // public static String convertToUpperCase(String anystriString){
        
    //     StringBuilder sb = new StringBuilder("");

    //     char ch = Character.toUpperCase(anystriString.charAt(0));
    //     sb.append(ch);

    //     for(int i =0; i < anystriString.length() ; i++){
    //         if(anystriString.charAt(i) == ' ' && i<anystriString.length()-1){
    //             sb.append(anystriString.charAt(i));
    //             i++;
    //             sb.append(Character.toUpperCase(anystriString.charAt(i)));
    //         }
    //         else{
    //             sb.append(anystriString.charAt(i));
    //         }
    //     }
    //     return sb.toString();
    // }

    public static String compressionString(String name){

        StringBuilder sb = new StringBuilder("");

        for(int i=0 ; i<name.length() ; i++){
            int count = 1;
            char ch  = name.charAt(i);

            while( i+1<name.length() &&name.charAt(i)==name.charAt(i+1) ){
                count++;
                i++;
            }
            if(count>1){
                sb.append(count);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        // find the largest string base on Laxicographic charracter.....
        // String fruits[] = {"apple" , "banana" , "mango"};
        // String  str = "helloworld";
        // System.out.println(subString(str, 0, 5));

        // String largest = fruits[0];
        // for(int i=1; i<fruits.length; i++){
        //     if(largest.compareTo(fruits[i])<0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);

        // <<<<<<<<<<<<<<<<<<<<<<<<||use of StringBuilder class||>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        // StringBuilder  sb = new StringBuilder("");

        // for(char ch = 'a' ; ch <= 'z' ; ch++){
        //         sb.append(ch);
        // }

        // System.out.println(sb);
        // System.out.print(sb.length());

        

        // Program to convert every first letter of any string into capital letter only first letter....
        
        // Scanner scan = new Scanner(System.in);

        // StringBuilder sb = new StringBuilder("");

        // System.out.println("Enter an string you want to::");

        // String anystring = scan.nextLine();

        // System.out.println(convertToUpperCase(anystring));


        String name = "aaaaabbbaadddddf";
        System.out.println(compressionString(name));
    }
}
