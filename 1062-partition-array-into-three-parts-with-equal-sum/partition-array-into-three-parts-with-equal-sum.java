class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        long sum = 0;
        for(int a : arr){
            sum += a;
        }

        if(sum%3 != 0) return false;
        long curr = 0;
        long s1 = sum/3, s2 = 2*sum/3, f = 0;
        for(int i = 0;i<arr.length; i++){
            curr += arr[i];
            if(curr == s1 && f==0) f++;
            else if(curr == s2 && f==1) f++;
            if(f==2 && i != arr.length -1) return true;
        }
        return false;
    }
}