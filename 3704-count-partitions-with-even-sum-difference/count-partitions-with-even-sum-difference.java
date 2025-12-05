class Solution {
    public int countPartitions(int[] nums) {
        int sum  = Arrays.stream(nums).sum();
        int c =0;
        int left = nums[0];
        int right = Math.abs(sum - left);
        for(int i =1; i<nums.length; i++){
            left += nums[i];
            right = sum -left;
            if(Math.abs(right-left)%2 == 0) c++;

        }
        return c;
    }
}