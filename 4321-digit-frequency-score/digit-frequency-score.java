class Solution {
    public int digitFrequencyScore(int n) {
        int[] f = new int[10];
        int ans = 0;
        while(n > 0){
            int d = n%10;
            f[d]++;
            n/=10;
        }
        int i = 0;
        for(int x : f){
            ans += i++*x;
        }

        return ans;
    }
}