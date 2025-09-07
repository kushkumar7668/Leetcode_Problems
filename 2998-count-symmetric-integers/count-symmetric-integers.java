class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count  =0;
        for(int j =low; j<=high; j++){
            String s = Integer.toString(j);
            if(s.length()%2==1) continue;
            int hsum = 0;
            int fsum = 0;
            for(int i =0;i<s.length()/2; i++){
                hsum+= s.charAt(i) - '0';
                fsum += s.charAt(i + (s.length()/2)) - '0';
            }
            if(hsum == fsum) count++;
        }
        return count;
    }
}