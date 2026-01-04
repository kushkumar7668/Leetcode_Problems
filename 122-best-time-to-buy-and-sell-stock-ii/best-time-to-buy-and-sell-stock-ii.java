class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int buy = prices[0];
        int profit = 0;
        for(int i =1; i<prices.length; i++){
            if(prices[i] < prices[i-1]){
                buy = prices[i];
            }
            if(prices[i] > buy ){
                profit = prices[i] - buy;
                ans = Math.max(ans, ans + profit);
                buy = prices[i];
            }
        }
        return ans;
    }
}