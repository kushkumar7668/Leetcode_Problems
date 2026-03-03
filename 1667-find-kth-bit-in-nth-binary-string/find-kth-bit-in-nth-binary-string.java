class Solution {
    public char findKthBit(int n, int k) {
        return (char) ('0' + solve(n, k));
    }
    private int solve(int n, int k) {
        // Base case
        if (n == 1) return 0;
        int length = (1 << n) - 1;        // Total length of Sn
        int mid = length / 2 + 1;         // Middle index
        // Middle element is always 1
        if (k == mid) return 1;
        // Left half
        if (k < mid) {
            return solve(n - 1, k);
        }
        // Right half (mirror + invert)
        int mirroredIndex = length - k + 1;
        return solve(n - 1, mirroredIndex) ^ 1;
    }
}