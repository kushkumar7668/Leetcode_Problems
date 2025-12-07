class Solution {
    public int largestPrime(int n) {
        boolean[] isPrime = new boolean[n+1];
        sieve(isPrime, n);
        int[] prime = new int[n+1];
        int p = 0;
        for(int i =0; i<isPrime.length; i++){
            if(isPrime[i]) {
                prime[p++] = i;
            }
        }

        int sum = 0, ans = 0;
        for(int x : prime){
            sum += x;
            if(sum > n) break;
            if(isPrime[sum]){
                ans = sum;
            }
            

        }

        return ans;
    }

    public void sieve(boolean[] isPrime, int n) {
        Arrays.fill(isPrime, true);
        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}