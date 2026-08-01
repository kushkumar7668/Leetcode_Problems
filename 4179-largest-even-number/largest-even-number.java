class Solution {
    public String largestEven(String s) {
        int i = s.length()-1;
        while(i>=0 && s.charAt(i) != '2'){
            i--;
        }
        String ans = i >=0 ? s.substring(0, i+1) : "";
        return ans;
    }
}