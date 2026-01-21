class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        // use formula (a & b) ^ (a&c) = a & (b^c)
        // take elements arr1 = [a, b, c] , arr2 = [x, y] and evaluate then apply above formula
        int xor1 = 0, xor2 = 0;
        for(int v : arr1) xor1 ^= v;
        for(int v : arr2) xor2 ^= v;

        return xor1 & xor2;
    }
}