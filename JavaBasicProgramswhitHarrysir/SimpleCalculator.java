import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean Running = true;

        while(Running){
            System.out.println("Enter your choice ");
            System.out.println("1. For Addtion");
            System.out.println("2. For Substraction");
            System.out.println("3. For Exit..");
            int choice = scan.nextInt();

            switch(choice){
                case 1:
                System.out.println("Enter First number: ");
                double a = scan.nextInt();
                System.out.println("Enter Second number: ");
                double b = scan.nextInt();
                System.out.println("Result : "+ (a+b));
                System.out.println();
                break;

                case 2:
                System.out.println("Enter First number: ");
                 a = scan.nextInt();
                System.out.println("Enter Second number: ");
                 b = scan.nextInt();
                 System.out.println("result: "+(a-b));
                 System.out.println();
                 break;

                case 3:
                    Running = false;
                    System.out.println("Exist the calculater ! Good Bye..");
                    System.out.println();
                    break;

                    default:
                        System.out.println("Invalid choice ! please Enter valid choice");
                        System.out.println();
            }
        }

    }
}
