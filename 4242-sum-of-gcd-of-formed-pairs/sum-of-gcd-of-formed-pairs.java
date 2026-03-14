class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int maxSoFar = nums[0];
        int[] gcd = new int[n];
        gcd[0] = nums[0];
        for(int i =1 ; i<n; i++){
            maxSoFar = Math.max(maxSoFar, nums[i]);
            gcd[i] = solve(maxSoFar, nums[i]);
        }
        Arrays.sort(gcd);

        int p1 = 0 , p2 = n-1;
        long ans = 0;

        while(p1 < p2){
            ans += solve(gcd[p1], gcd[p2]);
            p1++;
            p2--;
        }
        return ans;
    }
    // gcd using euclidean METHOD (see striver's video on yt) ->
    public int solve(int a , int b){
        while( b != 0 ){
            int c = a%b; // modulo will always be less than b
            a = b;  // now make a = b so that in next step value of b whch is bigger now will be used as a
            b = c;  // give b the remainder which is smaller value
        }
        return a;
    }
}