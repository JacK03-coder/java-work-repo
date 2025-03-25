public class sawpingNumbers {
    /*In Java, when you pass primitive types (like int) to a method, they are passed by value, not by reference. 
    This means the method swap gets copies of the original values of g and t,
     and any changes made inside the swap method will not affect the original values in the main method.
     */
    public static void swap(int g , int t){
        int temp;
        temp = g ;
         t   =   g;
         t   = temp;
    }
    public static void main(String[] args) {
        int g = 45;
        int t = 56;
        System.out.println("g::"+g + " t::"+t);
        swap(g ,t);
        System.out.println("g::"+g + " t::"+t);
        
     //<<<<<<<<<<<<-------------------SWAPING NUMBER'S------------------>>>>>>>>>>>>>>>>>
    // using temprory variable...
    int a = 34;
    int b = 43;
    int temp;

    System.out.println("a::"+a+" b::"+b);
    temp = a;
    a = b;
    b = temp;
    System.out.println("a::"+a+" b::"+b);

    // another way...using Arithmetic operator's

    int num1 = 34;
    int num2 = 43;
    System.out.println("a::"+num1+" b::"+num2);
    num1 = num1 +num2;
    num2 = num1- num2;
    num1 = num1 -num2;
    System.out.println("a::"+num1+" b::"+num2);

    //another way...using Bitwiase operator's
    int x = 34 ;
    int y = 43 ;
    System.out.println("a::"+x+" b::"+y);
    x = x^y;
    y = x^y;
    x = x^y;
    System.out.println("a::"+x+" y::"+y);
        
    }
}
