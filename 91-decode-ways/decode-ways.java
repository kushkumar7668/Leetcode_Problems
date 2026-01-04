class Solution {
    public int numDecodings(String s) {

        // dp[i] = number of ways to decode from index i
        Integer[] dp = new Integer[s.length()];

        return helper(s, 0, dp);
    }

    private int helper(String s, int i, Integer[] dp) {

        // reached end
        if (i == s.length()) return 1;

        // invalid if starts with '0'
        if (s.charAt(i) == '0') return 0;

        // already computed
        if (dp[i] != null) return dp[i];

        // take one digit
        int ways = helper(s, i + 1, dp);

        // take two digits if valid
        if (i + 1 < s.length() && isVal(s.charAt(i), s.charAt(i + 1))) {
            ways += helper(s, i + 2, dp);
        }

        return dp[i] = ways;
    }

    // checks if two digits form 10–26
    private boolean isVal(char a, char b) {
        return a == '1' || (a == '2' && b <= '6');
    }
}
