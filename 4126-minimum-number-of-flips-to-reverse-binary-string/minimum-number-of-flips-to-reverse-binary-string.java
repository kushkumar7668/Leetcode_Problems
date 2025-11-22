class Solution {
    public int minimumFlips(int num) {
        String s = Long.toBinaryString(num);
        int n = s.length();
        int count = 0;
        for(int i = 0; i<n; i++) {
            if(s.charAt(i) != s.charAt(n-i-1)) count++;
        }
        return count;
    }
}