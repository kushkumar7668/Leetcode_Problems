class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character>set = new HashSet<>();
        for(char ch : word.toCharArray()){
            if(ch >= 'A' && ch <= 'Z') set.add(ch);
        }
        int count = 0;
        for(char ch : word.toCharArray()){
            if(set.contains((char)(ch - 32))) {
                count++;
                set.remove((char)(ch-32));
            }
        }
        return count;
    }
}