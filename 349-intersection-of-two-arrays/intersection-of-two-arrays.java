// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         HashSet<Integer> set = new HashSet<>();
//         for(int i =0; i<nums1.length; i++){
//             for(int j = 0; j<nums2.length; j++){
//                 if(nums1[i] == nums2[j] && !set.contains(nums1[i])){
//                     set.add(nums1[i]);
//                 }
//             }
//         }

//         int[] arr = new int[set.size()];
//         int i =0;
//         for(int x : set){
//             arr[i] = x;
//             i++;
//         }
        

//         return arr;
//     }
// }



class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // Add all elements of nums1 into set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Check elements of nums2
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        // Convert result set to int array
        int[] ans = new int[result.size()];
        int i = 0;
        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }
}