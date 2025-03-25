
import java.util.ArrayList;
import java.util.List;

public class Day_20_11_NQueens {
    public static boolean isSafe(char[][] board, int row , int col){
       
        // Varically

        for(int j =0 ;j<board.length ; j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        // Horizontally
        for(int i = 0 ; i<board[0].length ; i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //upper left
        int r = row;
        for(int c=col; c>=0 && r>=0 ; c-- ,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        // upper right

         r=row;
         for(int c=col; c<board.length && r>=0 ; c++ ,r--){
            if(board[r][c]=='Q'){
                return false;
            }
         }

         // lower left

         r = row;
         for(int c = col ; c>=0 && r<board.length ; c-- , r++){
            if(board[r][c]=='Q'){
                return false;
            }
         }

         // lower right

         r = row;
         for(int c= col ; c<board.length && r<board.length ; c++,r++){
            if(board[r][c]=='Q'){
                return false;
            }
         }
         return true;
    }
    public static void saveBoard(char[][] board , List<List<String>> allBoards){
        String row = "";
        List<String> newboard = new ArrayList<>();
        
        for(int i =0 ; i< board.length ;i++){
            row= "";
            for(int j=0 ; j<board[0].length ; j++){
                if(board[i][j] == 'Q')
                     row +='Q';
                else
                    row += ".";
            }
            newboard.add(row);
        }
        allBoards.add(newboard);
    }
    public static List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n; j++){
                board[i][j] = '.';
            }
        }

        helper(board, allBoards, 0);
        return allBoards;
    }
    public static void helper(char[][] board , List<List<String>> allBoards, int col){
        if(col == board.length){
            saveBoard(board, allBoards);
            return;
        }
        for(int  row =0 ;row<board.length ; row++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';  
            }
        }
    }
    public static void main(String[] args) {
        int n =4;
        List<List<String>> solution = solveNQueens(n);

        for(List<String> board : solution){
            for(String row : board){
                System.out.println(row);
            }
            System.out.println();
        }
        
    }
}
