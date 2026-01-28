import java.util.*;
class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length ==1) return nums[0];
        int n = nums.length;
        ArrayList<Integer> ll = new ArrayList<>();
        for(int x : nums) ll.add(x);
        while(n > 1){
            for(int i =0; i<ll.size()-1; i++){
                int x = (ll.get(i) + ll.get(i+1)) % 10;
                ll.set(i, x);
            }
            ll.remove(n-1);
            n--;
        }
        return ll.get(0);
    }
}