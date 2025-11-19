class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] freq = new int[10001];
        int[] ans = new int[2];
        for(int i = 0; i<nums.length; i++){
           freq[nums[i]]++;
        }
        int f =0;
        for(int i =1 ;i<freq.length; i++){
            if(freq[i]==0 && f==0){
                ans[1]= i;
                f=1;
            }
            if(freq[i]==2){
                ans[0] = i;
            }
        }

        return ans;
    }
}