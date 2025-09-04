class Solution {
    boolean b = false;
    public boolean isPowerOfFour(int n) {
        if(n>1 && n%4 != 0) return false;
        byFour(n);
        return b;
        
        
    } 


    public void byFour(int n){
        if(n<1) {
            b = false;
            return;
        }
        if(n==1) {
            b =true;
            return ;
        }
        if(n%4==0){
            byFour(n/4);
        }
        return;

    }
}