class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int[][] ans = new int[grid.length][grid[0].length];
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if((i < x || i >= x+k) || (j < y || j >= y+k)){
                    ans[i][j] = grid[i][j];
                }
            }
        }

        for(int i = x; i<x+k; i++){
            for(int j = y; j < y+k; j++){
                ans[x+x+k-1-i][j] = grid[i][j];
            }
        }
        return ans;
    }
}