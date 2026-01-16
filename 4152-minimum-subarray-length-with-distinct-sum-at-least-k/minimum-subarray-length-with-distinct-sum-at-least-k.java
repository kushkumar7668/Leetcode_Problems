class Solution {
    public int minLength(int[] nums, int k) {
        
        
        int[] freq = new int[100001];
        
        long sum = 0;
        int l = 0, ans = Integer.MAX_VALUE;
        
        for (int r = 0; r < nums.length; r++) {
            if (freq[nums[r]] == 0) {
                sum += nums[r];
            }
            freq[nums[r]]++;

            // shrink window to minimum size
            while (sum >= k) {
                ans = Math.min(ans, r - l + 1);
                freq[nums[l]]--;
                if (freq[nums[l]] == 0)
                    sum -= nums[l];
                l++;
            }

        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
