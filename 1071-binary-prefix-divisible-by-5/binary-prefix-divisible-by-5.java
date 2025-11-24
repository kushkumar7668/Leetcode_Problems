class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        long val=0;
        List<Boolean> ans=new ArrayList<>();
        for(int i:nums){
            val*=2;
            val+=i;
            if(val == 0 || val%5==0) ans.add(true);
            else ans.add(false); 
            val%=5;
        }
        return ans;
    }
}