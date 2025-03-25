/*
 * Spiral matrix::: if you wnat to run this code i suggest you just dry run and write the code in notebook , solve it first you will definatly able to do it........ <[-_-]>
 * I really don't know i can do it again or not but i guess my concept , approach and logic is clear is for now  i kust maybe stuck on you know how the row and column variable 
 * i have to chose  otherwise everthing is on my control i hope so ok then see you later spiral matrix good bye.......
 */
public class Day_22_10_spiralMatrix {

    public static void spiralMatrix(int matrix[][]){

        int startRow = 0;
        int endRow   = matrix.length-1;
        int startCol = 0;
        int endCol   = matrix[0].length-1;

        while(startRow <=endRow && startCol<= endCol){

            //top:::
            for(int j=startCol; j<=endCol ; j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //right::
            for(int i = startRow+1 ; i<=endRow ; i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom:::

            for(int j=endCol-1 ; j>=startCol ; j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //left:::

            for(int i=endRow-1 ; i>startRow+1 ; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][] ={
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};
        spiralMatrix(matrix);
    }
}
