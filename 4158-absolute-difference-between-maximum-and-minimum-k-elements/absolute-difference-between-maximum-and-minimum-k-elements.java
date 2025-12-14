class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minSum = 0, maxSum = 0;
        for(int i =0; i<nums.length; i++){
            if(i>=k) break;
            minSum += nums[i];
            maxSum += nums[nums.length-i-1]; 
        }
        return maxSum-minSum;
    }
}