class Solution {
    public int minimumCardPickup(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i =0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                min = Math.min(min, 1 + i - map.get(nums[i]));
            }
            map.put(nums[i], i);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}