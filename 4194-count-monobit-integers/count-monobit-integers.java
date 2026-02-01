class Solution {
    public int countMonobit(int n) {
        int c = 0;
        while(n >= 0){
            if(n == 0) c++;
            else{
                if((n & n+1) == 0) c++;
            }
            n--;
        }
        return c;
    }
}