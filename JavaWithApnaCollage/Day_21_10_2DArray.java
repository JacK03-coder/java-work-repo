
import java.util.Scanner;

public class Day_21_10_2DArray {

    public static void search(int matrix[][] , int key){
        int largest = matrix[0][0];
        int smallest = matrix[0][0];

        for(int i=0 ; i<matrix.length; i++){
            for(int j=0 ;j<matrix[0].length ; j++){
                if(matrix[i][j]==key){
                    System.out.println("key is found at:  ("+i+","+j+")");
                }
                if(largest<matrix[i][j]){
                    largest = matrix[i][j];
                }
                if(smallest>matrix[i][j]){
                    smallest = matrix[i][j];
                }

            }
        }
        System.out.println("largest is:"+largest);
        System.out.println("smallest element is: "+smallest);
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int m=3 ; int n=3;
        Scanner scan = new Scanner(System.in);

        for(int i= 0 ; i<n; i++){
            for(int j=0 ; j<m ;j++){
                matrix[i][j] = scan.nextInt();
            }
        }

       for(int i=0 ; i<n ; i++){
          for(int j=0; j<m ; j++){
             System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
        }

        search(matrix, 7); 
    }
}
