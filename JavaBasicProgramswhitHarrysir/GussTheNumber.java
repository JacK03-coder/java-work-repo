
import java.util.Random;
import java.util.Scanner;

public class GussTheNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int computerGuess = random.nextInt(100);
        
        Scanner scan = new Scanner(System.in);

        int userGuess = 0;
        int attempts = 0;

        System.out.println("Enter The Number You Thing: ");

        while(userGuess!=computerGuess){
            userGuess = scan.nextInt();
            attempts++;

            if(userGuess<computerGuess){
                System.out.println(" kamm hai bro.. ! Firr try kar:");
            }else if(userGuess>computerGuess){
                System.out.println("jydaa ho  gya ab bro! Hoga Hoga: ");
            }else {
                System.out.println("shi hai yarr! Yhi to tha..."+computerGuess);
                System.out.println("Par bro tune  "+attempts+"  tuke lagaye..");
            }
        }

    }
}
