class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int c = 0;
        int t = n;
        while(t>0){
            t/=2;
            c++;
        }
        long com = (int)(Math.pow(2,c)) -1;
        return (int)(com ^ n);
    }
}