
import java.lang.reflect.Array;

public class Day_22_10_SumOfDigonals {

    public static int sumOfDiagonal(int matrix[][]){
        int sum = 0;

        // with the time complexity of O(n^2)..........
        for(int i =0 ; i<matrix.length ;i++){
            for(int j =0 ; j<matrix[0].length ; j++){
                if(i==j){
                    sum += matrix[i][j];
                } 
                else if(j+i == matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }

        // with the time complexIty of O(n)..........
        for(int i=0 ; i<matrix.length; i++){
            sum += matrix[i][i];

            if(i != matrix.length-i-1)
                sum += matrix[i][matrix.length-i-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(sumOfDiagonal(matrix));
    }
}
         

         