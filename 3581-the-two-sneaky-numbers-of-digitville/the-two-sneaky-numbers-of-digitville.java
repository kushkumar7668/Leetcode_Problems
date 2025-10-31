class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq = new int[102];
        for(int i =0;i<nums.length; i++){
            freq[nums[i]]++;
        }
        int  p = 0;
        int[] ans = new int[2];
        for(int i =0; i<freq.length; i++){
            if(freq[i] == 2) {
                ans[p] = i;
                p++;
            }
        }
        return ans;
    }
}