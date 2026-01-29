class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue <Integer> pos = new LinkedList<>();
        Queue <Integer> neg = new LinkedList<>();
        for(int x : nums){
            if(x > 0) pos.offer(x);
            else neg.offer(x);
        }

        int[] ans = new int[nums.length];
        for(int i =0; i<ans.length; ){
            ans[i++] = pos.poll();
            ans[i++] = neg.poll(); 
        }
        return ans;
    }
}