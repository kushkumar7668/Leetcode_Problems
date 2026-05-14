class Solution {
    public boolean isGood(int[] nums) {
        if (nums.length < 2)
            return false;
        Arrays.sort(nums);
        int n = nums.length;
        int[] freq = new int[201];
        for (int x : nums)
            freq[x]++;
        if (freq[nums[n - 1]] != 2)
            return false;
        int max = nums[n - 1];
        for (int i = 1; i < freq.length; i++) {
            if (i == max)
                break;
            else if (freq[i] != 1)
                return false;
        }
        return nums[n - 1] == nums[n - 2];
    }
}