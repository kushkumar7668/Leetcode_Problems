class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for(int i =0; i<32; i++){
            res <<= 1;
            int mask = n&1;  // extract last bit of n
            res = res | mask;
            n >>= 1;
        }
        return res;
    }
}