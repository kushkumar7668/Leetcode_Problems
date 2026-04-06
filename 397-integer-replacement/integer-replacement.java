class Solution {
    public int integerReplacement(int N) {
        long n = N;
        int c = 0;
        while(n != 1){
            if(n%2 == 0) n/=2;
            else{
                if(n == 3 || n%4 == 1) n--;
                else n++;
            }
            c++;
        }
        return c;
    }
}