class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length, col = grid[0].length;
        int[] arr = new int[row*col];
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                arr[i*col + j] = grid[i][j];
            }
        }
        k = k%arr.length;
        rev(arr, 0, arr.length-1);
        rev(arr, k, arr.length-1);
        rev(arr, 0, k-1);

        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<row; i++){
            List<Integer> ll = new ArrayList<>();
            for(int j = 0; j<col; j++){
                ll.add(arr[i*col+j]);
            }
            ans.add(ll);
        }
        return ans;

    }
    public void rev(int[] arr, int s, int e){
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}