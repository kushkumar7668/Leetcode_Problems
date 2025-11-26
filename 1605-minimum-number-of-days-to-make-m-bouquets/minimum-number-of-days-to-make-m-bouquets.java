class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int ans = -1;
        int s =0;
        int e = Arrays.stream(bloomDay).max().getAsInt(); // give maximum from array
        int mid = s + (e-s)/2;
        while(s <= e){
            if(canBloom(bloomDay, m, k, mid)){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }

            mid = s + (e-s)/2;
        }
        return ans;
    }

    public boolean canBloom(int[] bloomDay, int m, int k, int mid){
        int bouquet = 0;
        int flowers =0;
        for(int i =0; i<bloomDay.length; i++){
            if(mid >= bloomDay[i]){
                flowers++;
            }
            else{
                bouquet += flowers/k;
                flowers = 0;
            }
            if(bouquet >= m){
                return true;
            }
            
        }
        //after last iterarion
        bouquet += flowers/k;
        if(bouquet >= m){
            return true;
        }

        return false;

    }
}