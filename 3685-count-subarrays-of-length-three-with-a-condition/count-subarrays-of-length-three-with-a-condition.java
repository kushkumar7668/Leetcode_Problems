class Solution {
    public int countSubarrays(int[] nums) {
        int left = 0, c = 0;
        for(int right = 2; right<nums.length; right++){
            if(2*(nums[left] + nums[right]) == (nums[right-1])) c++;
            left++;
        }
        return c;
    }
}