class Solution {
    public int[] fairCandySwap(int[] nums1, int[] nums2) {
        int t1 = 0, t2 = 0;
        for (int x : nums1) t1 += x;
        for (int x : nums2) t2 += x;

        Set<Integer> set = new HashSet<>();
        for(int x : nums2){
            set.add(x);
        }

        for(int a : nums1){
            int b = (t2-t1+2*a)/2;
            if(set.contains(b)) return new int[]{a,b};
        }
        return new int[]{0,0};
    }
}