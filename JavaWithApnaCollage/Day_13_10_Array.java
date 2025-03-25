
import java.util.Scanner;

public class Day_13_10_Array {

    //1. Array As Function Argument's::

    public static void update(int marks1[]){

        for(int i =0 ; i<marks1.length ; i++){
            marks1[i] = marks1[i] + 1;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int myArray[] = new int[15]; // Integer Array of size 15...
        int myArray2[] = {3,3,33,3,3,3,3,3,3,3,3}; // Integer Array of Size 11...
        String myArray3 [] = {"Dustin" , "Mike" , "Will" , "Lucus" , "Eleven" , "Max"}; // Stirng Array of Name and Size of 6....


        //:::::::::Array Input & Output:::::::::
        int marks[] = new int[10];
        System.out.println("Enter marks:::");
        marks[0] = scan.nextInt(); //math
        marks[1] = scan.nextInt(); //chemistry
        marks[2] = scan.nextInt(); //physics

        System.out.println("The marks are:::");
        System.out.println("physics : "+marks[2]+"  chemistry  :"+marks[1]+ "  Math:  56"+marks[0]);


        //1.Array As Function Argument's.........

        int marks1[] = {56,55,44,96,98};
        System.out.println("marks1 Mark's");
        for(int i = 0; i<marks1.length;i++){
            System.out.println(marks1[i]);
        }
        
        System.out.println("Updated marks1 Mark's");
        update(marks1);
        for(int i = 0; i<marks1.length;i++){
            System.out.println(marks1[i]);
        }
    }
}
