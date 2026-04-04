class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int sum  = 0;
        for(int v : nums)
            sum += v;
        int left = 0, right = 0, ans = -1, curr = 0;

        if(curr == (sum-x)) return n;   // if whole array has to be removed

        while(right < n){
            curr += nums[right];
            while(curr > (sum-x) && left < right){
                curr -= nums[left];
                left++;
                if(curr == (sum-x)){
                    ans = Math.max(ans, right-left+1);
                }
            }
            if(curr == (sum-x)){
                    ans = Math.max(ans, right-left+1);
            }
            right++;
        }
        if(ans == -1) return -1;
        else return n-ans;
    }
}