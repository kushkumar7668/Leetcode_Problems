class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] prefix = new long[n];
        prefix[0] = nums[0];
        for(int i =1; i<n; i++){
            prefix[i] = nums[i] + prefix[i-1];
        }

        long ans = Long.MIN_VALUE;
        
        for(int s=0; s<k; s++){
            long currSum = 0;

            int  i = s;

            while(i<n && i+k-1 < n){
                int j = i+k-1;
                long subSum = prefix[j] - (i>0 ? prefix[i-1]: 0);
                
                currSum = Math.max(subSum, currSum + subSum);
                ans = Math.max(ans, currSum);

                i+=k;
            }

        }
        return ans;
    }
}