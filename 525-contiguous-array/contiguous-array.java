class Solution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) { // Base Case
            return 0;
        }
        // Converting all 0 to -1
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) nums[i] = -1;
        }
        int sum = 0; 
        int max = 0; 
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // put reference in the starting of 0 & -1
        for(int i = 0; i < nums.length; i++){
            sum += nums[i]; // prefix sum
            if(map.containsKey(sum)){ 
                //refer to codestorywithMIK
                //if we get it's value means last+1 to i index has same number of 0 and 1
                int last = map.get(sum); 
                max = Math.max(max, i - last); 
            }
            else{ 
                map.put(sum, i);
            }
        }
        return max; 
    }
}