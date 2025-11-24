// class Solution {
//     public List<Boolean> prefixesDivBy5(int[] nums) {
//         long val=0;
//         List<Boolean> ans=new ArrayList<>();
//         for(int i:nums){
//             val = val<<1;
//             val += i;
//             if(val == 0) ans.add(true);
//             else ans.add(false); 
            
//         }
//         return ans;
//     }
// }


class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int val = 0;

        for (int i : nums) {
            val = ((val * 2) + i) % 5;
            // mod 5 to avoid overflow
            res.add(val == 0);
        }

        return res;
    }
}
