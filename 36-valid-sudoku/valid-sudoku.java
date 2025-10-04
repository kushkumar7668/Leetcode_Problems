class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!isitsafe(board, i, j, board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isitsafe(char[][] grid, int row, int col, char val) {
        //			row
        for (int i = col + 1; i < 9; i++) {
            if (grid[row][i] == val) {
                return false;
            }
        }
        //			col
        for (int i = row + 1; i < 9; i++) {
            if (grid[i][col] == val) {
                return false;
            }
        }
        // 3*3 Matrix
        int sr = row - row % 3;
        int sc = col - col % 3;
        int flip = 0;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (grid[i][j] == val) {
                    flip++;
                    if (flip == 2) {
                        return false;
                    }
                }
            }
        }
        return true;

    }
}