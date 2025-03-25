import java.util.*;
public class RockPaperScissor_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // For Computer....
        while(true){
            String [] avilableMove = {"Rock" , "Paper", "Scissor"};
            String  ComputerMoves = avilableMove[new Random().nextInt(avilableMove.length)];
            System.out.println("Computer chosen a move");
            System.out.println();
            System.out.println("It's your turn to choose an move");
            System.out.println();
            

        //For User..
        String UserMove;

        while (true) {
            System.out.println("Please Enter your move from avaliable moves : 'Rock' 'Paper' 'Scissor'" ); 
            System.out.println("Enter Your Move: ");
            UserMove = scan.nextLine();

            if(UserMove.equalsIgnoreCase("Rock")||UserMove.equalsIgnoreCase("Paper")||UserMove.equalsIgnoreCase("Scissor")){
            System.out.println();
            break;
            }
             System.out.println("Invaild move..\n Please Enter a valid move from available move..");
             System.out.println();

            }

            System.out.println("Computer Chose:  "+ComputerMoves);

            //COMPARING THE MOVE & DECIDING WINNER...

            if(UserMove.equals(ComputerMoves)){
                System.out.println("The match is tie..");
            }
            
            else if(UserMove.equalsIgnoreCase("Rock")){
                if(ComputerMoves.equalsIgnoreCase("Paper")){
                    System.out.println("Computer win!");
                }else if (ComputerMoves.equalsIgnoreCase("Scissor")){
                    System.out.println("You win!");
                }
            } 
            else if(UserMove.equalsIgnoreCase("Paper")){
                if(ComputerMoves.equalsIgnoreCase("Scissor")){
                    System.out.println("Computer win!");
                }else if (ComputerMoves.equalsIgnoreCase("Rock")){
                    System.out.println("You win!");
                }
            }  else if(UserMove.equalsIgnoreCase("Scissor")){
                if(ComputerMoves.equalsIgnoreCase("Rock")){
                    System.out.println("Computer win!");
                }else if (ComputerMoves.equalsIgnoreCase("Paper")){
                    System.out.println("You win!");
                }
            } 
                //If user want to play again...
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


