class Solution {
    public int countVowel(String str) {
        String vowel = "aeiou";
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (vowel.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    public String reverseWords(String s) {
        String st[] = s.split(" ");
        int first = countVowel(st[0]);
        for (int i = 1; i < st.length; i++) {
            if (countVowel(st[i]) == first) {
                st[i] = new StringBuilder(st[i]).reverse().toString();
            }
        }
        return String.join(" ", st);
    }
}