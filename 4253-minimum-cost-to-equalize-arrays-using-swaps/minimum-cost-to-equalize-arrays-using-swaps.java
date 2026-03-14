class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] freq = new int[800001];
        int[] f1 = new int[800001];
        int[] f2 = new int[800001];
        for(int i = 0; i<n; i++){
            freq[nums1[i]]++;
            freq[nums2[i]]++;
            f1[nums1[i]]++;
            f2[nums2[i]]++;
        }

        for(int x : freq){
            if(x %2 == 1) return -1;
        }
        
        int c = 0;
        for(int i = 0; i<freq.length; i++){  
            c += Math.abs(f1[i] - f2[i]) / 2; 
        }

        return c/2;  
    }
}