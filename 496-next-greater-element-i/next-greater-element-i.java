class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       
        int n = nums1.length;
        int[] nge = new int[n];
        Arrays.fill(nge, -1);
        for (int i = 0; i < n; i++) {
            
            // default if no greater element found
            // check elements to the right, wrapping around
            int idx = -1;
            for(int j = 0; j<nums2.length; j++){
                if(nums2[j] == nums1[i]){
                    idx = j;
                    break;
                }
            }
            for (int step = idx+1; step < nums2.length; step++) {
            // For each index i, look at the next n-1 elements (wrap using modulo)
                
                if (nums2[step] > nums1[i]) {
                    nge[i] = nums2[step];
                    break; // found the first greater element
                }
            }
        }
        return nge;
    }
}