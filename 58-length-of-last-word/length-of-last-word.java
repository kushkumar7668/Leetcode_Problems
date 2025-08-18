class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {  // avoid trailing spaces
            i--;            //  e.g. -> " fly me to the moon  "
        }

        while (i >= 0 && s.charAt(i) != ' ') {  // count length until next space from last word is encountered 
            length++;
            i--;
        }
        return length;
    }
}