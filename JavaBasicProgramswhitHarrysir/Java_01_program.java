
import java.util.Scanner;

public class Java_01_program {
    public static void main(String[] args) {
        System.out.println("Finds the percentage of number & numbers inputs by the user...");
        System.out.println("NOTE :: The marks must lies in between 0 to 100...");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter physics marks: ");
        float physcis  = scan.nextInt();
        System.out.println("Enter Maths marks: ");
        float maths = scan.nextInt();
        System.out.println("Enter Chemistry marks: ");
        float chemistry  = scan.nextInt();
        System.out.println("Enter Hindi marks: ");
        float hindi  = scan.nextInt();
        System.out.println("Enter English marks: ");
        float english  = scan.nextInt();
        
        float total = (physcis+maths+chemistry+hindi+english);
        System.out.println("The total marks is: "+total);

        float percentage = (total/500)*100;

        System.out.println("The Precentage of the marks is: "+ percentage);


    }
}
