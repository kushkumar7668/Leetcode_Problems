class Solution {
    public boolean isValidSudoku(char[][] board) {
        return sudokoSolver(board,0,0);
    }

public static boolean sudokoSolver(char[][] arr, int row, int col) {
        if (row == arr.length) {
            row = 0;
            col = col + 1;
        }

        if (col == arr.length) {
            return true;
        }

        if (arr[row][col] == '.') {
            return sudokoSolver(arr, row + 1, col);
        } 
        else if (isSafe(arr, row, col,  arr[row][col])) {
               return sudokoSolver(arr, row + 1, col) ;
                
                
            }
        

        return false;
    }

    public static boolean isSafe(char[][] arr, int row, int col,char digit) {

                    char ch= digit;

        for (int i = 0; i < arr.length; i++) {
           //skiping current cell
            if (arr[i][col] == ch && i != row) {
                return false;
            }

//skipping current cell 
            if (arr[row][i] == ch && i != col) {
                return false;
            }
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {

//skipping current cell
                if (arr[i][j] == ch && i != row && j != col ) {
                    return false;
                }
            }
        }

        return true;
    }
}