class Solution {
    public int largestInteger(int n, int s) {
        if(1.0*s/9 > 1.0*n) return -1;
        if(s == 0) return 0;
        StringBuilder sb = new StringBuilder();
        while((s-9) >= 0){
            sb.append('9');
            s -= 9;
        }
        if(s%9 != 0) sb.append(s%9);
        while(sb.length() != n) sb.append('0');
        if(sb.length() == n) return Integer.parseInt(sb.toString());
        else return -1;
    }
}