class Solution {
    public int vowelConsonantScore(String s) {
        int v = 0, c =0;
        for(char ch : s.toCharArray()){
            if(ch ==' ') continue;
            else if(ch - '0' >=0 && ch-'0' <=9) continue;
            else if(ch =='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u') v++;
            else c++;
        }
        return c>0 ? (int)Math.floor(v/c) : 0;
    }
}