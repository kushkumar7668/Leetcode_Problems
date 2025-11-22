class Solution {
    public int minimumOperations(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            c = nums[i]%3 != 0 ? c+1 : c;
        }
        return c;
    }
}