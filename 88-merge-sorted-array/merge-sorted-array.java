class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i=0;
       int j=0;
       if(n==0)return;
       while (i<m+j && j<n){
            if(nums1[i]<=nums2[j]){
                i++;
            }
            else{
                int k=m+j;
                for(int idx=k;idx>i;idx--){
                    nums1[idx]=nums1[idx-1];
                }
                nums1[i]=nums2[j];
                i++;
                j++;
            }
       }
       while (j < n) {
            nums1[i] = nums2[j];
            i++;
            j++;
        }
       
    }
}