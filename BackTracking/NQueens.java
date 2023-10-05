import java.util.ArrayList;
import java.util.List;

public class NQueens {

    static void queen(char[][] board, int row, List<List<String>> ans){
        if(row == board.length){
            ans.add(makeString(board));
            return;
        }
        for(int col=0 ; col<board.length ; col++){
            if(isSafe(board,row,col)){
                board[row][col] = 'Q';
                queen(board,row+1,ans);
                board[row][col]='.';
            }
        }
    }

    public static List<List<String>> solveNQueens(int n){
        char [][] board = new char[n][n];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        queen(board,0,ans);
        return ans;
    }

    static List<String> makeString(char[][] board){
        List<String> L = new ArrayList<>();
        for(int i=0 ; i<board.length ; i++){
            String row = new String(board[i]);
            L.add(row);
        }
        return L;
    }

    static boolean isSafe(char[][] board, int row, int col){
        //for checking vertical row
        for(int i=0 ; i<row ; i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //for checking left diagonal
        int maxLeft = Math.min(row,col);
        for(int i=1 ; i<= maxLeft ; i++){
            if(board[row - i][col - i]=='Q'){
                return false;
            }
        }

        //for checking right diagonal
        int maxRight = Math.min(row,board.length - 1 - col);
        for(int i=1 ; i<= maxRight ; i++){
            if(board[row - i][col + i]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        List<List<String>> ans = solveNQueens(4);
        System.out.println(ans);
        System.out.println("Number of solutions : " + ans.size());
    }
}
