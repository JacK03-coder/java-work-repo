//problem 1. 
import java.util.Scanner;

public class Day_07_10_problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value you want matrix of: ");
        int value = scan.nextInt();
        int [][] matrix = new int[value][value];
        int maxDiagonal = matrix[0][0];

        System.out.println("Enter the Element of the matrix: ");

        for(int i = 0 ; i<value ; i++){
            for(int j =0 ; j<value ; j++){
                System.out.print("Element at ["+i+"]["+j+"]: ");
                matrix[i][j] = scan.nextInt();
            }
        }
        for(int i = 0 ; i< value ;i++){
            if(maxDiagonal>matrix[i][i]){
                maxDiagonal = matrix[i][i];
            }
            if(maxDiagonal<matrix[i][value-1-i]){
                maxDiagonal = matrix[i][value-1-i];
            }
        }

        System.out.println("The Matrix is :");

        for(int i =0 ;i< value; i++){
            for(int j = 0; j<value ; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("The maximum Digonal is : "+maxDiagonal);   
    }
}
