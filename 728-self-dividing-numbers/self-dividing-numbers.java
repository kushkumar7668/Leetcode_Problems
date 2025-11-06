class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i =left; i<=right; i++){
            int t =i;
            while(t>0){
                if(t%10 == 0) {
                    break;
                }
                else if(i%(t%10) == 0 ){
                    t/=10;
                }
                else{
                    break;
                }
            }
            if(t==0){
                ans.add(i);
            }
        }
        return ans;
    }
}