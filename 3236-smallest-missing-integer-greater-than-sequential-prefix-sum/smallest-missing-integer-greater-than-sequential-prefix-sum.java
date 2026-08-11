class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x: nums) set.add(x);

        int s = nums[0];

        for(int i=1; i<nums.length; i++){
            
            if(nums[i] != nums[0] + i ){
                break;
            }
            s += nums[i];
            
        }

        if(!set.contains(s)) return s;

        else{
            while(set.contains(s)) s++;
            
        }
        return s;
    }
}