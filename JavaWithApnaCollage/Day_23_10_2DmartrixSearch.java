public class Day_23_10_2DmartrixSearch {


    // Using brute force technique.....
    public static boolean searchElement(int matrix[][], int key){

        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                if(matrix[i][j]==key){
                    return true;
                }
            }
        }
        return false;
    }

    // Considering the top-left  starting point...
    public static boolean stairsCaseSearch(int matrix1[][] , int key){

        int row = 0 ; int col = matrix1[0].length-1;

        while(row<matrix1.length && col>=0){
            if(matrix1[row][col]==key){
                System.out.println("key found at("+row+","+col+")");
                return true;
            }
            if(key<matrix1[row][col]){
                col--;
            }else
                row++;
        }

        return false;
    }

    // considering the bottom-right starting point.... 
    public static boolean stairsCaseSearch1(int matrix1[][] , int key){

        int row = matrix1.length-1 ; int col =0;

        while(col<matrix1.length && row>=0){

            if(matrix1[row][col]==key){
                System.out.println("Key is found at ("+row+", "+col+")");
                return true;
            }

            if(key<matrix1[row][col]){
                row--;
            }else
             col++;
        }

        return false;
    }
    public static void main(String[] args) {
        int matrix[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};  
         System.out.println(searchElement(matrix,15));

         int matrix1[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
         int key = 33;
         System.out.println(stairsCaseSearch(matrix1, key));
         System.out.println(stairsCaseSearch1(matrix1, 90));
    }
}