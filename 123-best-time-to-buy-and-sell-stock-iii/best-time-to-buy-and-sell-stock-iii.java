class Solution {
    public int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length][2][3]; //3 because transacations can be 0 1 2
        for (int i = 0; i < dp.length; i++) {
            for(int j =0; j<2; j++){
                for(int k=0; k<3; k++){
                    dp[i][j][k] = -1;

                }
            }
        }
        int hold = 0;
        return helper(prices, 0, hold, 0, dp);
    }

    public int helper(int[] prices, int i, int hold, int t, int[][][] dp) {
        if (i >= prices.length) {
            return 0;
        }
        if(t == 2) return 0;

        if (dp[i][hold][t] != -1)
            return dp[i][hold][t];

        if (hold == 0) {
            int buy = -prices[i] + helper(prices, i + 1, 1, t, dp);
            int skip = helper(prices, i + 1, 0, t, dp);
            return dp[i][hold][t] = Math.max(buy, skip);
        }

        else {
            int sell = prices[i] + helper(prices, i + 1, 0, t+1, dp);
            int skip = helper(prices, i + 1, 1, t, dp);
            return dp[i][hold][t] = Math.max(sell, skip);
        }
    }
}