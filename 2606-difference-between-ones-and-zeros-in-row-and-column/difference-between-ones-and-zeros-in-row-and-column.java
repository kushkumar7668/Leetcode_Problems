class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[][] ans = new int[grid.length][grid[0].length];
        // row tarversal
        for(int i =0; i<grid.length; i++){
            int oneRow = 0, zeroRow = 0;
            for(int j = 0;j< grid[i].length; j++){
                if(grid[i][j] == 0) zeroRow++;
                else oneRow++;
            }
            
            for(int j =0; j<grid[i].length; j++){
                ans[i][j] = oneRow - zeroRow;
            }
        }

        for(int j = 0; j<grid[0].length; j++){
            int oneCol = 0, zeroCol = 0; 
            for(int i =0 ; i<grid.length; i++){
                if(grid[i][j] == 0) zeroCol++;
                else oneCol++;
            }

            for(int i =0 ; i<grid.length; i++){
                ans[i][j] += oneCol - zeroCol;
            }
        }
        return ans;
    }
}