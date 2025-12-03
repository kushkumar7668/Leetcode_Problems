class Solution {
    public int distributeCandies(int[] candyType) {
        int half = candyType.length / 2;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < candyType.length; i++) {
            set.add(candyType[i]);
        }
        return Math.min(half, set.size());
        // maan lo ki set me sirf ek hi tarh ki candy ho toh fir n/2 candies toh khaa ji nhi sakta h because usko unique candies khaani h
    }
}