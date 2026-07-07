class Solution {
    public long sumAndMultiply(int n) {
        int x = 0;
        int sum = 0;
        String s = "";
        StringBuilder sb = new StringBuilder();
        while(n>0){
            if(n%10 != 0){
                sb.append((char)((n%10) + '0'));
                sum += n%10;
            }
            n /= 10;
        }
        s = sb.reverse().toString();
        if(sb.length() ==0) return 0;
        x = Integer.parseInt(s);
        return (long)x * sum;
    }
}