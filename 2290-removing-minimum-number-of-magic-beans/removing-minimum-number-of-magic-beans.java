class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);

        int n = beans.length;
        /*  nums = a, b, c, d ( a < b < c < d )
            if make nums [a, a, a, a] remove beans (b - a) + (c - a) + (d - a) == b + c + d - 3a
            if make nums [0, b, b, b] remove beans a + (c - b) + (d - b) == a + c + d - 2b
            if make nums [0, 0, c, c] remove beans a + b + (d - c) == a + b + d - c
            if make nums [0, 0, 0, d] remove beans a + b + c
*/
        
        long total = 0;
        for(int x : beans) total += x;
        
        long ans = Long.MAX_VALUE;
        for(int i = 0; i<n; i++){
            long curr = total - 1L * (n-i) * beans[i];
            ans = Math.min(ans, curr);
        }
        return ans;

    }
}