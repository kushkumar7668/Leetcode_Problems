class Solution {
    public long calculateScore(String[] arr, int[] values) {
        long ans = 0;
        int n = arr.length;
        boolean[] vis = new boolean[n];
        int i = 0;
        while(i >= 0 && i < n && vis[i] != true){
            if(arr[i].equals("jump")){
                vis[i] = true;
                i += values[i];

            }
            else if(arr[i].equals("add")){
                vis[i] = true;
                ans += values[i++];
            }
        }
        return ans;
    }
}