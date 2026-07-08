class Solution {
    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, n= nums.length;
        int idx1 = -1, idx2 = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                idx1 = i;
            }
            if(nums[i] < min){
                min = nums[i];
                idx2 = i;
            }
        }

        int choice1 = Math.min(idx1+1, n-idx1) + Math.min(idx2 + 1, n- idx2);

        int choice2 = Math.min(Math.max(idx1, idx2) + 1, Math.max(n-idx1 , n- idx2));
        return Math.min(choice1, choice2);
        

    }
}