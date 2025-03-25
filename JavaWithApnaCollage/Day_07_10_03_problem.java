
import java.util.Scanner;
import javax.lang.model.element.Element;

public class Day_07_10_03_problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The number of row's in first matrix: ");
        int row1 = scan.nextInt();
        System.out.println("Enter the number of column's in second matrix : ");
        int column1 = scan.nextInt();

        System.out.println("Enter the number of row's in secod matrix: ");
        int row2 = scan.nextInt();

        System.out.println("Enter the number of column in the second matrix: ");
        int column2 = scan.nextInt();

        if(column1 !=row2){
            System.out.println(" Matrix Multiplication  not possible , you have enter the number of column1 and number of row 2 same...");  
        }
        else{
            int[][] matrix1 = new int[row1][column1];
            int[][] matrix2 = new int[row2][column2];
            int[][] result  = new int [row1][column2];

            System.out.println("Enter the element of first matrix: ");
            for(int i = 0; i<row1 ; i++){
                for(int j = 0 ; j<column1 ; j++){
                    System.out.println("Element at ["+i+"]["+j+"]");
                    matrix1[i][j]= scan.nextInt();
                }
            }

            System.out.println("Enter element of second matrix : ");
            for(int i = 0 ; i<row2 ; i++){
                for(int j = 0; j<column2 ; j++){
                    System.out.println("Element at ["+i+"]["+j+"]");
                    matrix2[i][j] = scan.nextInt();
                }
            }

            for(int i = 0 ; i<row1 ; i++){
                for(int j =0 ; j<column2 ;j++){
                    result[i][j] = 0;
                    for(int k = 0 ; k<column1 ;k++){
                        result[i][j] += matrix1[i][k]*matrix2[k][j];
                    }
                }
            }

            for(int i = 0 ;i<row1 ; i++){
                for(int j=0; j<column1 ;j++){
                    System.out.print(matrix1[i][j]+"\t");
                }
                System.out.println();
            }

            for(int i =0 ; i<row2 ; i++){
                for(int j = 0 ;j<column2 ;j++){
                    System.out.print(matrix2[i][j]+"\t");
                }
                System.out.println();
            }
            
            System.out.println("The new matrix after multiplication is: ");
            for(int i = 0 ; i< row1 ; i++){
                for(int j =0 ; j< column2 ;j++){
                    System.out.print(result[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }
}
