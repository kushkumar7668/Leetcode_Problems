class Solution {
    public long maxPairStrength(int[] nums) {
        long ans = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                ans = Math.max(ans, (1L*nums[i] * nums[j]) /(int) Math.pow(gcdRecursive(nums[i], nums[j]), 2));
            }
        }
        return ans;
    }
    public static int gcdRecursive(int a, int b) {
        // Base case: if b is 0, the GCD is a
        if (b == 0) {
            return a;
        }
        
        // Recursive step
        return gcdRecursive(b, a % b);
    }
}