class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right =0;
        int maxlen = 0;

        while(right < s.length()) {
            char c = s.charAt(right);

            while(set.contains(c)) {
                set.remove(s.charAt(left));
                left++;                
            }
            
            maxlen = Math.max(maxlen, right - left + 1);

            set.add(s.charAt(right));
            right++;
        }

        return maxlen;
    }
}