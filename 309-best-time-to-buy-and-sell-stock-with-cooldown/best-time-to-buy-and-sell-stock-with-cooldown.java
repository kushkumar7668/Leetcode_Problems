class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for(int[] a : dp){
            Arrays.fill(a, -1);
        }
        int hold = 0;
        return helper(prices, 0, hold, dp);
    }
    
    public int helper(int[]prices, int i, int hold, int[][] dp){
        if(i >= prices.length){
            return 0;
        }

        if(dp[i][hold] != -1) return dp[i][hold];

        if(hold == 0){
            int buy = -prices[i] + helper(prices, i+1, 1, dp);
            int skip = helper(prices, i+1, 0, dp);
            return dp[i][hold] = Math.max(buy, skip);
        }

        else{
            int sell = prices[i] + helper(prices, i+2, 0, dp);
            int skip = helper(prices, i+1, 1, dp);
            return dp[i][hold] = Math.max(sell, skip);
        }
    }
}