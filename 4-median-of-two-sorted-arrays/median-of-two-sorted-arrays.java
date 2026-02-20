class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m+n];
        int j = 0;
      
        for(int i = 0; i< m; i++){
           arr[i] = nums1[i];
        }
        for(int i = m; i< m+n; i++){
           arr[i] = nums2[j];
           j++;
        }
        Arrays.sort(arr);
        if(arr.length % 2 == 1){
            return (double)(arr[arr.length /2]);
        }
        return  ((double)((arr[arr.length/2 -1] + arr[arr.length/2]))/2);
    }
}