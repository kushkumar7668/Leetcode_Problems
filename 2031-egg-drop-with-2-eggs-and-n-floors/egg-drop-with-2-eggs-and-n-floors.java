class Solution {
    public int twoEggDrop(int n) {
        int ans = 0;
        int d = 1;
        while(n>0){
            n = n-d;
            ans++;
            d++;
        }
        return ans;
    }
}