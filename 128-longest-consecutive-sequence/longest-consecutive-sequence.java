class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0) return 0;
        Arrays.sort(nums);
        int curr = 1;
        int max = 1;
        HashSet<Integer> set = new HashSet<>();
        set.add(nums[0]);
        for(int i =1; i<nums.length; i++){
            if(set.contains(nums[i])){
                continue;
            }
            else if(set.contains(nums[i]-1)){
                set.add(nums[i]);
                curr++;
                // max = Math.max(curr, max);    
            }
            else{
                curr = 1;
                set.add(nums[i]);
            }
            max = Math.max(curr, max);
        }
        return max;
    }
}