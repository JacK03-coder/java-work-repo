/*
 * In that code i do more then one thing in the problem so it can give  total solution , single solution and number of solution .....
 * you can do all of them if you know how and you know if you remmber it now i don't know when i gonna do it again but litrally it tooks me more then 10 hour bro.....
 */

public class Day_21_11_NQueens22 {

    public static boolean isSafe(char board[][] , int row , int col){

        // horizontally ...
            for(int j=0 ; j<board.length ; j++){
                if(board[row][j] == 'Q'){
                    return false;
                }
        }

        // Vartically
        for(int i=0 ; i<board.length ; i++){
            if(board[i][col] == 'Q'){
                return  false;
            }
        }

        // upper-left
        int r =row;
        for(int c=col ; c>=0 && r>=0 ; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // upper-right

        r = row;
        for(int c = col;r>=0 && c<board.length;c++,r--){
            if(board[r][c]== 'Q'){
                return false;
            }
        }

        // lower-left

        r = row;
        for(int c= col ; r<board.length && c>=0 ; r++ ,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        r = row;
        for(int c=col ; c<board.length && r<board.length ; c++,r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }
    
    public static boolean  nQueens(char board[][] , int row){
        if(row==board.length){
          // printBoard(board);
           count++;
            return true;
        }

        for(int j=0 ; j<board.length ; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(nQueens(board, row+1)){
                    return true;
                }
                board[row][j] = 'X';
            }
        }
        return false;
    }
    public static void printBoard(char board[][]){
        System.out.println("--------------------Chess Board----------------");
    
        for(int i=0 ; i <board.length; i++){
            for(int j =0 ; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    } 

    static int count = 0;
    public static void main(String[] args) {
        int n =4;
        char board[][] = new char[n][n];

        for(int i=0 ; i <n ; i++){
            for(int j =0 ; j<n ; j++){
                board[i][j] = 'X';
            }
        }
        // nQueens(board, 0);
        // System.out.println("Total number of ways to arrange Queen's is: "+ count);

        if(nQueens(board, 0)){
            System.out.println("Solution is Possible");
            printBoard(board);
        }else{
            System.out.println("Solution is not possible");
        }
    }
}
