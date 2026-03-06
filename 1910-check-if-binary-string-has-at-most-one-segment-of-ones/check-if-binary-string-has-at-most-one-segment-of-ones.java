class Solution {
    public boolean checkOnesSegment(String s) {
        int f = 0, c =0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '1' && f==0){
                f = 1;
                while(i<s.length() && s.charAt(i) == '1'){
                    i++;
                }
            }
            else if(ch == '1'){
                return false;
            }
        }
        return true;
    }
}