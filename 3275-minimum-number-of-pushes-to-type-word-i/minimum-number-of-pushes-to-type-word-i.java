class Solution {
    public int minimumPushes(String word) {
        int c = 0;
        
        for(int i = 0; i<word.length(); i++){
            int k = i/8 + 1;
            c+=k;

        }
        return c;
    }
}