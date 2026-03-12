class Solution {
    public int maxArea(int[] nums) {
        int n = nums.length;
        int maxWater = 0, curr = 0;
        int p1 = 0, p2 = n-1;
        while(p1 < p2){
            curr = Math.min(nums[p1], nums[p2]) * (p2-p1);
            maxWater = Math.max(maxWater, curr);
            if(nums[p1] < nums[p2]) p1++;
            else p2--;
        }
        
        return maxWater;
    }
}