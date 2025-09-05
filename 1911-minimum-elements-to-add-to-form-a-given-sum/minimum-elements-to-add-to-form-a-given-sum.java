class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for(int i=0; i<nums.length; i++){
            sum+=(long)nums[i];
        }
        long diff = (long)Math.abs(goal-sum);
        if(diff % (long)limit == 0) return (int)(diff/(long)limit);
        return (int)(diff/(long)limit) +1;
    }
}