class Solution {
    public int maxPower(String s) {
        char prev = s.charAt(0), curr = s.charAt(0);
        int ans = 1;
        int c = 1;
        for(int i = 1; i<s.length(); i++){
            curr = s.charAt(i);
            if(curr == prev){
                c++;
            }
            else{
                c = 1;
                prev = curr;
            }
            ans = Math.max(ans, c);
        }
        return ans;

    }
}