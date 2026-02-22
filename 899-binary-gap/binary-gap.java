class Solution {
    public int binaryGap(int n) {
        int ans = 0;
        int prev = -1;
        int c = 0;
        while(n > 0){
            int mask = n&1;
            if(mask == 1){
                if(prev == -1){
                    prev = c;
                }
                else{
                    ans  = Math.max(ans, c - prev);
                    prev = c;
                }
            }
            c++;
            n >>= 1;
        }
        return ans;

    }
}