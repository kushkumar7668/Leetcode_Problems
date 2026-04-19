class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int ans = 0;
        int n = nums2.length;
        for(int i = 0; i<nums1.length; i++){
            int idx = search(nums1, nums2, i, n-1);
            ans = Math.max(ans, idx - i);
        }
        return ans;
    }

    public int search(int[] nums1, int[] nums2, int i, int j){
        int idx = i;
        int low = 0, high = nums2.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums1[i] <= nums2[mid]){
                idx = mid;
                low = mid+1;

            }
            else high = mid-1;
        }
        return idx;
    }
}