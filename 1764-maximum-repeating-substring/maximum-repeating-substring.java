class Solution {
    public int maxRepeating(String sequence, String word) {
        String s = word;
        int l1 = sequence.length();
        int l2 = word.length();
        int c = 0;
        for(int i =0; i<= l1/l2 +1; i++){
            if(sequence.indexOf(s) != -1){
                c++;
                s = s + word; 
            }
            else return c;
        }
        return c;
    }
}