class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int c = 0;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] <= nums[i-1]){
                c += (nums[i-1] - nums[i] + 1); 
                // since the next number must be atleast 1 greater than its previous element
                nums[i] = nums[i-1] + 1;
            }
        }
        return c;
    }
}