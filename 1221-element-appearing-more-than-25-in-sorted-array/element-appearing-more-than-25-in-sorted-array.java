class Solution {
    public int findSpecialInteger(int[] nums) {
        int n = nums.length;
        int q = n/4;
        for(int i = q; i<n; i++){
            if(nums[i] == nums[i-q]) return nums[i];
        }
        return -1;
    }
}