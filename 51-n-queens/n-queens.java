import java.util.*;
class Solution {
    public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];
        for(char[] row : board){
            Arrays.fill(row , '.');
        }

        List<List<String>> ans = new ArrayList<>();
        helper(board, 0, ans);
        return ans;
    }

    static void helper(char[][] board, int row, List<List<String>> list) {

        if (row == board.length) {

            list.add(construct(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                helper(board, row + 1, list);
                board[row][col] = '.';
            }
        }
    }

    static List<String> construct(char[][] board) {

        List<String> ll = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = new String(board[i]);
            ll.add(row);
        }
        return ll;
    }

    static boolean isSafe(char[][] board, int row, int col) {

        //for checking vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        //for checking left diagonal

        int maxLeft = Math.min(row, col);

        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i] == 'Q') {
                return false;
            }
        }

        //for checking right diagonal

        int maxRight = Math.min(row, board.length - 1 - col);

        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i] == 'Q') {
                return false;
            }
        }

        return true;
    }
}