class Solution {
    public int countCommas(long n) {
        int ans  = 0;
        int b = 1000;
        int c  = 1;
        while(b<=n){
            ans += n - b +1;
            b*=1000;
           
        }
        return ans;
    }
}
 