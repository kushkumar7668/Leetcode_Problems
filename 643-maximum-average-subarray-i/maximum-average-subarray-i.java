class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double ans  = -Double.MAX_VALUE;
        long sum = 0;
        for(int i = 0; i<k; i++){
            sum += nums[i];
        }
        ans = Math.max(ans, ((double)sum)/k);
        for(int i = k; i<n; i++){
            sum -= nums[i-k];
            sum += nums[i];
            ans = Math.max(ans, (double)sum/k);
        }
        return ans;
    }
}