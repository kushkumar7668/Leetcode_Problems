class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int c = 0, curr =0;

        for(int i =0; i<nums.length; i++){
            curr += nums[i];
            if(curr == 0) c++;
        }
        return c;
    }
}