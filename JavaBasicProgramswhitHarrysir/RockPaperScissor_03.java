import java.net.spi.URLStreamHandlerProvider;
import java.util.*;
public class RockPaperScissor_03 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       //For compupter....
       while(true){
        String[] AavilableMove = {"Rock", "Paper", "Scissors"};
        String ComputerMove = AavilableMove[new Random().nextInt(AavilableMove.length)];

        System.out.println("Computer Chosen move!");
        System.out.println("Now it's your turn to choose an move..!");


         //for Users
        String UserMove;
        while(true){
         System.out.println("Please Enter an move from avilable  moves : 'Rock', 'Paper', 'Scissor' ");
         System.out.println("Enter Your Move..!");
         UserMove = scan.nextLine();
         if(UserMove.equalsIgnoreCase("Rock")||UserMove.equalsIgnoreCase("Paper")||UserMove.equalsIgnoreCase("Scissor")){
             break;
         }
         System.out.println("Enter Valid Move!");
        }
        System.out.println("Computer chosen: "+ComputerMove); 

        //Camparing inputs & deciding  winner...!

        if(UserMove.equalsIgnoreCase(ComputerMove)){
            System.out.println("Match is tie..!");
        }
        
        else if(UserMove.equalsIgnoreCase("Rock")){
            if(ComputerMove.equalsIgnoreCase("Paper")){
                System.out.println("Computer win..!");
            }else if(ComputerMove.equalsIgnoreCase("Scissor")){
                System.out.println("You win..!");
            }
        }

        else if(UserMove.equalsIgnoreCase("Paper")){
            if(ComputerMove.equalsIgnoreCase("Scissor")){
                System.out.println("Computer win..!");
            }else if(ComputerMove.equalsIgnoreCase("Rock")){
                System.out.println("You win..!");
            }
        }

        else if(UserMove.equalsIgnoreCase("Scissor")){
            if(ComputerMove.equalsIgnoreCase("Rock")){
                System.out.println("Computer win..!");
            }else if(ComputerMove.equalsIgnoreCase("Paper")){
                System.out.println("You win..!");
            }
        }

        System.out.println();
        String PlayAgain;
        System.out.println("Do You Want To Play again..");

        while(true){
            System.out.println("Enter Yes or No..");
            PlayAgain = scan.nextLine();
            if(PlayAgain.equalsIgnoreCase("Yes")||PlayAgain.equalsIgnoreCase("No")){
                System.out.println();
                System.out.println("******************************************************");
                System.out.println();
                break; 
            }
            System.out.println();
            System.out.println("Invalid Input..");
            System.out.println();
        } 
        if (PlayAgain.equalsIgnoreCase("NO")){
            break;
        }  
    } 
}
}



        