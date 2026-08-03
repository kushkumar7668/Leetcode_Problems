class Solution {
    int p = 0;
    public int[] countTasks(int[] tasks, int[] shifts) {
        int n = tasks.length;
        long[] pre = new long[n];
        pre[0] = tasks[0];
        for(int i = 1; i<n; i++){
            pre[i] = tasks[i] + pre[i-1];
        }
        int i = 0;
        long w = 0;
        int[] ans = new int[shifts.length];
        for(int x : shifts){
            w += x;
            if(w >= pre[n-1]) {
                ans[i++] = 0;
                w = 0;
            }
            else{
                int completed = counttask(pre, w);
                ans[i++] = n - completed;
            }
        }
        return ans;
    }

    public int counttask(long[] arr, long work){
        int l = 0, r = arr.length-1, t = 0; 
        while(l <= r){
            int mid = l+(r-l)/2;
            if(arr[mid] <= work) {
                l = mid+1;
                t = mid+1;
                
            } 
            else r = mid-1;
        }
        return t;
    }
}