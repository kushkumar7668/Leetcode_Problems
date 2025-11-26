class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum =0;
        int currsum =0;
        int minsum =0;

        for(int x : nums){
            currsum += x;
            currsum = Math.max(currsum , x);
            maxsum = Math.max(maxsum, currsum);
        }

        currsum = 0;
        for(int x : nums){
            currsum += x;
            currsum = Math.min(currsum , x);
            minsum = Math.min(minsum, currsum);
        }
        

        return Math.max(Math.abs(maxsum), Math.abs(minsum));
    }
}