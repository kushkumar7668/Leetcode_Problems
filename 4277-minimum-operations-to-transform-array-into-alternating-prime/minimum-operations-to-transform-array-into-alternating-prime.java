class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(i % 2 == 0){
                while(!isPrime(nums[i])){
                    nums[i] += 1;
                    ans++;
                }
            }
            else{
                while(isPrime(nums[i])){
                    nums[i]+=1;
                    ans++;
                }
            }
        }
        return ans;
    }
    boolean isPrime(int n){
        if(n <= 1)return false;
        for(int i=2; i<= Math.sqrt(n); i++){
            if(n % i == 0)return false;
        }
        return true;
    }
}