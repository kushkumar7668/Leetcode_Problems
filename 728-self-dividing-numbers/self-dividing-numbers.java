class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i =left; i<=right; i++){
            int num = i;
            while(num>0){
                if( num%10 == 0 || (i % (num%10))!=0 ) {
                    break;
                }
                num /= 10;
            }
            if(num==0){
                ans.add(i);
            }
        }
        return ans;
    }
}