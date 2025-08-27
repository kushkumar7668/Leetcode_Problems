class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i<nums.length; i++){
            set.add(nums[i]);
        }

        int maxLen = 0;
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i] - 1)){ // jab set me nums[i] -1 nhi ho tab
                int len = 0;
                int key = nums[i];
                while(set.contains(key)){
                    set.remove(key);
                    len++;
                    key++;
                }
                maxLen = Math.max(len, maxLen);
            }
        }
        return maxLen;
    }
}