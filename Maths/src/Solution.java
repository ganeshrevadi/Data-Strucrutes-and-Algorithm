import java.util.*;
public class Solution {
    public List<List<Integer>> nQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<Integer>> allBoards = new ArrayList<>();
        queens(board,0,allBoards);
        return allBoards;
    }

    public void saveBord(boolean[][] board , List<List<Integer>> allBoards){

        List<Integer> board2 = new ArrayList<>();
        for(boolean[] row : board) {
            int row1 = -1;
            for(boolean element : row) {
                if (element) {
                    row1 += 1;
                } else {
                    row1 += 0;
                }
            }

            board2.add(row1);
        }
        allBoards.add(board2);

    }

    int queens(boolean[][] board, int row,List<List<Integer>> allBoards) {
        if (row == board.length) {
//            display(board);
            saveBord(board,allBoards);
            System.out.println();
            return 1;
        }

        int count = 0;

        // placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1,allBoards);
                board[row][col] = false;
            }
        }

        return count;
    }

    private  boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]) {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]) {
                return false;
            }
        }

        return true;
    }
}