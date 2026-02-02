class Solution {
    public boolean isValid(String word) {
        if(word.length() <3) return false;
        int vowel = 0, consonant = 0,digit = 0;
        
        for(char ch : word.toCharArray()){
            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                vowel++;
                else consonant++;
            }
            else if(ch >= '0' && ch <= '9'){
                digit++;
            }
            else return false;
        }
        if(vowel == 0 || consonant == 0) return false;
        return true;
    }
}