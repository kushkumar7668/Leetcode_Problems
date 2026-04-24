class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0,r=0,c=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L') l++;
            else if(ch=='R') r++;
            else c++;
        }
        return Math.abs(l-r)+c;
    }
}