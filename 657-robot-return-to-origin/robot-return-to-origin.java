class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for(char c : moves.toCharArray()){
            y = c=='U' ? y+1 : y;
            y = c=='D' ? y-1 : y;
            x = c=='L' ? x-1 : x;
            x = c=='R' ? x+1 : x;
        }
        return x==0 && y==0;
    }
}