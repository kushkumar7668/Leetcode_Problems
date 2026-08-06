class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(product(n) % t == 0) break;
            n++;
        }
        return n;
    }
    public int product(int n){
        int p = 1;
        while(n > 0){
            p *= n%10;
            n/=10;
        }
        return  p;
    }
}