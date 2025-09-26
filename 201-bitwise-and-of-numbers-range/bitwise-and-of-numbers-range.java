class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int count  =0; // count so that we are again can make a result;
        while(left < right){
            left = left >> 1;
            right = right >> 1;
            count++;
        }
        return left << count;
    }
}