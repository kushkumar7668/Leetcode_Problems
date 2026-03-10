class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n = nums.length;
        long maxLimit = (long) 1e14;
        long[] left = new long[n];
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + nums[i - 1];
        }
        long[] right = new long[n];
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (right[i + 1] > maxLimit / nums[i + 1])
                right[i] = maxLimit + 1;
            else
                right[i] = right[i + 1] * nums[i + 1];
        }

        int ans = -1;
        for (int i = 0; i < left.length; i++) {
            if (left[i] == right[i])
                return i;
        }

        return ans;

    }
}