class Solution {
    public int countOdds(int low, int high) {
        low = (low % 2 == 1) ? low - 1 : low; // if low is odd make him even by reducing 1 to preserve the range
        high = (high % 2 == 1) ? high + 1 : high;// if high is odd make him even by increasing 1 to preserve the range

        // for two even numbers number of odd is always (high-low)/2
        return (high - low) >> 1;
    }
}