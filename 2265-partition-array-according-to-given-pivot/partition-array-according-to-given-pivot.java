// class Solution {
//     public int[] pivotArray(int[] nums, int pivot) {
//         int n = nums.length;
//         int[] ans = new int[n];
//         int less = 0, equal = 0, greater = 0;
//         for(int x : nums){
//             if(x < pivot) less++;
//             if(x == pivot) equal++;
//             if(x > pivot) greater++;
//         }
//         int l = 0, e = less, g = less + equal;
//         for(int i = 0; i<n; i++){
//             if(nums[i] < pivot){
//                 ans[l++] = nums[i];
//             }
//             else if(nums[i] == pivot){
//                 ans[e++] = nums[i];
//             }
//             else{
//                 ans[g++] = nums[i];
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int[] ans=new int[n];
        int l=0;
        int r=n-1;
        for(int i=0,j=n-1;i<n;i++,j--){
            if(nums[i]<pivot){
                ans[l++]=nums[i];
            }
            if(nums[j]>pivot){
                ans[r--]=nums[j];
            }
        }
        while(l<=r) ans[l++]=pivot;
        return ans;
    }
}