class Solution {
    static final int mod = 1_000_000_007;
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int[] row : queries){
            int left = row[0];
            int right = row[1];
            while(left <= right){
                nums[left] = (int)((1L*nums[left]*row[3]) % mod);
                left += row[2];
            }
        }

        int ans = nums[0];
        for(int i = 1; i<nums.length; i++) ans = ans ^ nums[i];

        return ans;
    }
}