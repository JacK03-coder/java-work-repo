import java.util.Scanner;

public class Day_02_09 {
    // static int sum(int...arr){
    //     int result = 0;
    //     for(int element : arr){
    //         result += element;
    //     }return result;
    // }
    public static void main(String[] args) {
    //     System.out.println("Printing sum of number's using Variable Argument's:::");
    //     System.out.println("sum of 2,3,43,3,,4,3 is : "+sum(2,3,43,3,4,3));
    //     System.out.println("sum of 2,3,4,5 is: "+ sum(2,3,4,5) );


        // String name = "hellohello";
        // String N = new String();
        // for(int i = 0 ; i<name.length() ; i++){
        //     String  X = String.valueOf(name.charAt(i));
        //     if(N.contains(X)){
        //         N +=X;
        //     }
        // }
        // System.out.println(" "+N);

        // String name = "hellehello";
        // String N = new String();
        // for (int i = 0; i < name.length(); i++) {
        //     String X = String.valueOf(name.charAt(i));
        //     if(!N.contains(X)){
        //         N +=X;
        //     }
        // }
        // System.out.println(" "+N);

        // String name = "HELLOHELLO";
        // String N = new String();

        // for ( int i =  0 ; i<name.length() ; i++){
        //     String X = String.valueOf(name.charAt(i));

        //     if(!N.contains(X)){
        //         N += X;
        //     }
        // }System.out.println("the subString is : "+N);

        // String name = "hellohello";
        // String N = new String ();
        // for(int i=0 ;i <name.length();i++){
        //     String X = String.valueOf(name.charAt(i));

        //     if(!N.contains(X)){
        //         N+=X;
        //     }
        // }System.out.println(" "+N);

        String name = "hellohello";
        String N = new String();
        for (int i = 0 ; i < name.length() ; i++){
            String X = String.valueOf(name.charAt(i));

            if(!N.contains(X)){
                N +=X;
            }
       }System.out.println("new string : "+N);
    }
}