class Solution {
    public int minOperations(String s) {
        int c1 = 0, c2 = 0;

        for (int i = 0; i < s.length(); i++) {

            char expected1 = (i % 2 == 0) ? '0' : '1'; // 010101...
            char expected2 = (i % 2 == 0) ? '1' : '0'; // 101010...

            if (s.charAt(i) != expected1) c1++;
            if (s.charAt(i) != expected2) c2++;
        }

        return Math.min(c1, c2);
    }
}