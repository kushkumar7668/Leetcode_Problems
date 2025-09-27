// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i=0;
//        int j=0;
//        if(n==0)return;
//        while (i<m+j && j<n){
//             if(nums1[i]<=nums2[j]){
//                 i++;
//             }
//             else{
//                 int k=m+j;
//                 for(int idx=k;idx>i;idx--){
//                     nums1[idx]=nums1[idx-1];
//                 }
//                 nums1[i]=nums2[j];
//                 i++;
//                 j++;
//             }
//        }
//        while (j < n) {
//             nums1[i] = nums2[j];
//             i++;
//             j++;
//         }

//     }
// }

class Solution {
   public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int k = m + n - 1;
        
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[k] = nums1[p1];
                k--;
                p1--;
            } else {
                nums1[k] = nums2[p2];
                k--;
                p2--;
            }
        }
    }
}
