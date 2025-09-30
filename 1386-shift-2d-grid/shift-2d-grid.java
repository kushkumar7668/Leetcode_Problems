class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int temp = m * n;
        int a[] = new int[temp];
        k = k % temp;
        int q = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[q++] = grid[i][j];
            }
        }
        int[] t = new int[temp];
        q = 0;
        for (int i = 0; i < k; i++)
            t[i] = a[temp - k + i];

        for (int i = k; i < temp; i++)
            t[i] = a[i - k];
            
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = t[q++];
            }
        }
        return (List) Arrays.asList(grid);
    }
}