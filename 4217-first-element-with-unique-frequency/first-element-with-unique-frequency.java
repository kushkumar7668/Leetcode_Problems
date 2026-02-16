class Solution {
    public int firstUniqueFreq(int[] nums) {
        int[] freq = new int[100001];
        for(int i= 0;i<nums.length; i++){
            freq[nums[i]]++;
        }

        int ans = -1;
        int[] f2 = new int[freq.length];
        for(int i =0; i<freq.length; i++){
            f2[freq[i]]++;
        }

        for(int i =0; i<nums.length; i++){
            if(f2[freq[nums[i]]] == 1) return nums[i];
        }
        return -1;
    }
}