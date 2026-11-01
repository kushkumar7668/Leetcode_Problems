class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for(int x : nums){
            min = Math.min(min, x);
        }

        int c = 0;
        for(int x : nums){
            c += (x- min);
        }
        return c;
    }
}