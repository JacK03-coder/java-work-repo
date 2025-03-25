import java.util.Random;
import java.util.Scanner;
import jdk.jshell.SourceCodeAnalysis;

public class GuessTheNumber_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int computerGuess = random.nextInt(100)+1;

        int userGuess = 0;
        int attempts =  0;

        System.out.println("Enter The Number You Think Of : ");

        while(userGuess!= computerGuess){
            userGuess = scan.nextInt();
            attempts++;

            if(userGuess<computerGuess){
                System.out.println("Too low , Try Again..");
            }else if (userGuess>computerGuess){
                System.out.println("Too High , Try agian..");
            }else{
                System.out.println("congratulation ! You Guess The Right Number : "+computerGuess);
                System.out.println("But ! It takes You "+attempts+" Attempte's");
            }
        }
    }
}
