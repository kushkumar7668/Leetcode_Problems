// class Solution {
//     public int maxDistance(int[] nums1, int[] nums2) {
//         int ans = 0;
//         int n = nums2.length;
//         for(int i = 0; i<nums1.length; i++){
//             int idx = search(nums1, nums2, i);
//             ans = Math.max(ans, idx - i);
//         }
//         return ans;
//     }

//     public int search(int[] nums1, int[] nums2, int i){
//         int idx = i;
//         int low = 0, high = nums2.length-1;
//         while(low <= high){
//             int mid = low + (high - low)/2;
//             if(nums1[i] <= nums2[mid]){
//                 idx = mid;
//                 low = mid+1;

//             }
//             else high = mid-1;
//         }
//         return idx;
//     }
// }



 /* OPTIMAL SOLUTION - Two Pointers
     *
     * Algorithm:
     * 1. Use two pointers: i for nums1, j for nums2
     * 2. If nums1[i] <= nums2[j]: valid pair, increment j
     * 3. Else: increment i
     * 4. Track maximum distance
     *
     * Time Complexity: O(n + m) - LINEAR!
     * Space Complexity: O(1)
     *
     i          *
     * {55, 30, 5, 4, 2};
     j                   *
     * {100, 20, 10, 10, 5};
     */
class Solution{
    public static int maxDistance(int[] nums1, int[] nums2) {
        int maxDist = 0;
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                maxDist = Math.max(maxDist, j - i);
                j++;
            } else {
                i++;
            }
        }
        return maxDist;
    }
}