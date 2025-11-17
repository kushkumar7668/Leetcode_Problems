class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int curr = -1;
        int prev = Integer.MIN_VALUE;
        for(int i =0; i<nums.length; i++){
            if(nums[i] == 1 && curr == -1){
                curr = i;
                // prev = i;
            }
            else if(nums[i] == 1){
                prev = curr;
                curr = i;
                if(curr - prev-1 < k) return false;

            }
            
        }
        return true;
    }
}