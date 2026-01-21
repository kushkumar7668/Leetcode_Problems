class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0, xor2 = 0;
        for(int i : nums1) xor1 ^= i;
        for(int i : nums2) xor2 ^= i;

        if(nums2.length %2 == 0 && nums1.length%2 == 0) return 0;
        else {
            if(nums1.length%2 == 1 && nums2.length %2 == 1) return xor1 ^ xor2;
        }
        if(nums1.length%2 ==0) return xor1;
        else return xor2;
    }
}