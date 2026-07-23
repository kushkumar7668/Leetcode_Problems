class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, c = 0;
        int max = nums[n-1] , prev = Integer.MIN_VALUE;
        for(int i = n-1; i>=0; i--){
            if(nums[i] != prev){
                prev = nums[i];
                c++;
                if(c == 3) return nums[i];
            }
        }
        return max;
    }
}