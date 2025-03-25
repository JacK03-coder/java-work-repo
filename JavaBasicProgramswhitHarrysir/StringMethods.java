
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println("Some basic string methods...");

        String name = "Jack";
      //use of name.length method to check length of string...
      //  int value = name.length();
      //  System.out.println(value);

      //conver string into upper case to lower case and lower cse upper case...
      //  String Newvalue = name.toLowerCase();
      //  System.out.println(Newvalue);
      //  String Newvalue = name.toUpperCase();
      //  System.out.println(Newvalue);

      //trim an string...
      // String jack  = "      jay      ";
      // String Jack = jack.trim();
      // System.out.println(Jack);
      

      //Print string after a index / Print string substring....
     // System.out.println(name.substring(2));
     // System.out.println(name.substring(1,4));
     //System.out.println(name.replace('J','D'));


    //Check string start with and end with condition met...
    // System.out.println(name.startsWith("j"));
    //System.out.println(name.endsWith("k"));
     

    //Check the position of string cheracters with help of index...
    // System.out.println(name.charAt(3));

    //check the index of any cheracter....
    // System.out.println(name.indexOf("J"));

    //It checks the string after the  given index ignores all the cherecters come before the string ...
    // System.out.println(name.indexOf("k",4)); 


     //System.out.println(name.lastIndexOf("c"));

     //Match the string...
     //System.out.println(name.equals("Jack"));
     // System.out.println(name.equalsIgnoreCase("jack"));

    }
}
