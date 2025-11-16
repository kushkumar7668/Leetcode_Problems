class Solution {
    public int minLengthAfterRemovals(String s) {
        int count_a = 0;
        int count_b = 0;
        int n = s.length();

        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'a') count_a++;
            else count_b++;
        }

        //number of pairs ->
        int pairs = Math.min(count_a, count_b);

        // Final length
        return n - 2 * pairs;
    }
}
