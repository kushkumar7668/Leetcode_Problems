class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for(int v : nums){
            int c = 0;
            int s = 1+v;
            for(int i = (int)Math.sqrt(v); i>1; i--){
                if(v%i == 0 && i*i != v){
                    c+=2;
                    s += i;
                    s+= v/i;
                }
                if(i*i == v){
                    c += 1;
                    s += i;
                }
            }
            if(c==2) ans += s ;
        }
        return ans;
    }
}