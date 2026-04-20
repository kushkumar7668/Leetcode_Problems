class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int start = 0, end = n - 1;
        int ans = 0;

        for(int i = 0; i < n; i++){
            if(colors[i] != colors[start])
                ans = Math.max(ans, i);

            if(colors[i] != colors[end])
                ans = Math.max(ans, end - i);
        }

        return ans;
    }
}