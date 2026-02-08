class Solution {
    public int dominantIndices(int[] nums) {
        int[] pre = new int[nums.length+1];
        pre[nums.length] = 0;
        for(int i = nums.length-1; i>=0; i--){
            pre[i] = pre[i+1] + nums[i];
        }
        int c = 0;
        for(int i =0; i<nums.length-1; i++){
            if(nums[i] > pre[i+1]/(nums.length-1-i)){
                c++;
            }
        }
        return c;
    }
}