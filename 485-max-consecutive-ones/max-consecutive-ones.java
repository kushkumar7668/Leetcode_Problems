class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr =0;
        int max =0;
        for(int i =0; i<nums.length;i++){
            if(nums[i]==1){
                curr++;
            }
            else if(nums[i] == 0){
                curr = 0;
            }
            max = Math.max(max,curr);
        }
        return max;
    }
}