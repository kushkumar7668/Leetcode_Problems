// class Solution {
//     public int maxSubArray(int[] nums) {
//         int ans=Integer.MIN_VALUE;
//         int sum=0;
//         for(int i=0;i<nums.length;i++){
//             sum+= nums[i];
//             ans = Math.max(sum, ans);
//             if(sum<0){
//                 sum=0;      // kadane's algo
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public int maxSubArray(int[] nums) {
        int storage[] = new int[nums.length];
        int max = nums[0];
        storage[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            storage[i] = Math.max(storage[i - 1] + nums[i], nums[i]);
            if (storage[i] > max) {
                max = storage[i];
            }
        }
        return max;
    }
}