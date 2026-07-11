class Solution {
    public int[] minCosts(int[] cost) {
        int[] ans = new int[cost.length];
        int minsofar = cost[0];
        int i = 0;
        for(int x : cost){
            minsofar = Math.min(minsofar, x);
            ans[i++] = minsofar;
        }
        return ans;

    }
}