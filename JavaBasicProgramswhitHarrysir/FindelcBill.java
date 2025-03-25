
import java.util.Scanner;

public class FindelcBill {
    public static void main(String[] args) {
        System.out.println("Print Electricity bill..");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Electricity Unit :   ");
        float unit = scan.nextFloat();
        float bill = calculteBill(unit);

        if (unit == 0) {
            System.out.println("No Bill..");
        }
        else {
            System.out.println("Your Electricity Bill Is: "+bill);
        }
    }
    static float calculteBill(float unit)  {
        if(unit <= 100) {
            return 0;
        }
        else if (unit<=200) {
            return 
            (unit-100)*5;
        }
        else {
            return 
            (100*5)+((unit-200)*10);
        }
    }
    
}
