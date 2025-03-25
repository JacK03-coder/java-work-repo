import java.util.Random;
import java.util.Scanner;
import jdk.jshell.spi.ExecutionControl;

public class RockPaperScissorEasyWay {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        System.out.println("Enter 0 for Rock , 1 for Paper And 2 for Scissor: ");
        int userInput = scan.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);
        //Printing User Input.....
        String [] newstring1 = {"Rock","Paper","Scissor"};
        System.out.println("User Choice : "+newstring1[userInput]);
        //Printing Computer Input's too......
        String [] newstring = {"Rock" ,"Paper", "Scissor"};
        System.out.println("Computer Input: "+newstring[computerInput]);

        if(computerInput == userInput){
            System.out.println("Match Is Tie");
        }else if(userInput==0 && computerInput==1 || userInput==1 && computerInput==2|| userInput==2&&computerInput==0){
            System.out.println("Nice! You Win...");
        }else{ 
           //System.out.println("Computer Chosen: "+computerInput);
           System.out.println("Bad Luck! computer Win..."); 
        }
    }
}