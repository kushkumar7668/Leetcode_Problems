class Solution {
    public int jump(int[] nums) {
        int near = 0, far = 0, jump = 0;
        int n = nums.length;
            int farthest = 0;

        while(far < n-1){

            for(int i = near; i<=far; i++){
                farthest = Math.max(farthest, i + nums[i]);
                // near = Math.min(near, nums[i]);
            }
            near = far +1;
            far = farthest;
            jump++;
        }
        return jump;
    }
}