
import java.util.Scanner;
import javax.lang.model.element.Element;

public class peobem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<------------------code to print to matrix and their multiplication--------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        System.out.println("Enter the number of row in first matrix: ");
        int row1 = scan.nextInt();
        System.out.println("Enter the number of column in first matrix: ");
        int column1 = scan.nextInt();

        System.out.println("Enter the number of row in second matrix:");
        int row2 = scan.nextInt();
        System.out.println("Enter the number of column in second matrix:");
        int column2 = scan.nextInt();

        if(column1 != row2){
            System.out.println("Multiplication not possible , you have to enter the value of column1 and row2 same...");
        }

        else{
        int [][] matrix1 = new int[row1][column1];
        int [][] matrix2 = new int[row2][column2];
        int [][] result  = new int [row1][column2];

        System.out.println("Enter the element of first matrix:::");

        for(int i=0;i<row1;i++){
            for(int j=0;j<column1;j++){
                System.out.println("Element at ["+i+"]["+j+"]");
                matrix1[i][j]=scan.nextInt();
            }
        }


        System.out.println("Enter the element of second matrix:::");

        for(int i=0;i<row2;i++){
            for(int j=0;j<column2;j++){
                System.out.println("Element at["+i+"]["+j+"]");
                matrix2[i][j]=scan.nextInt();
            }
        }

        for(int i =0 ;i<row1 ;i++){
            for(int j=0; j<column2;j++){
                result[i][j] =0;
                for(int k=0 ; k<column1 ;k++){
                    result[i][j] += matrix1[i][k]*matrix2[k][j];
                }
            }
        }

        System.out.println("The Element of first matrix::");
        for(int i =0 ; i< row1 ;i++){
            for(int j=0 ; j< column1 ;j++){
                System.out.print(matrix1[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("The Element of second matrix is:::");
        for(int i=0;i<row2 ;i++){
            for(int j=0;j<column2 ;j++){
                System.out.print(matrix2[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("The matrix after Multiplication is:::");
        for(int i =0 ;i<row1;i++){
            for(int j=0;j<column2;j++){
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
    }


    //<<<<<<<<<<<<<<<<<<<<<<<---------------------------code too print an squar matrix and print the maximum diagonal from it--------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    System.out.println("Enter the number you want squar matrix of ::: ");
    int value = scan.nextInt();

    int[][] matrix  = new int[value][value];
    int maxDiagonal = matrix[0][0];

    for(int i=0;i<value;i++){
        for(int j=0; j<value ;j++){
            System.out.println("Element at ["+i+"]["+j+"]");
            matrix[i][j]=scan.nextInt();
        }
    }

    for(int i=0;i<value;i++){
        if(maxDiagonal<matrix[i][i]){
            maxDiagonal = matrix[i][i];
        }
        if(maxDiagonal<matrix[i][value-1-i]){
            maxDiagonal = matrix[i][value-1-i];
        }
     }

     System.out.println("The Element of the matrix are:::");
     for(int i=0 ; i<value;i++){
        for(int j=0 ;j<value ;j++){
            System.out.print(matrix[i][j]+"\t");
        }System.out.println();
     }
     System.out.println("The maximum Diagonal is : "+maxDiagonal);
  }
}