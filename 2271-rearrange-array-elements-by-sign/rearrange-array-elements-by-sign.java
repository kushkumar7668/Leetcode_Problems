// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         Queue <Integer> pos = new LinkedList<>();
//         Queue <Integer> neg = new LinkedList<>();
//         for(int x : nums){
//             if(x > 0) pos.offer(x);
//             else neg.offer(x);
//         }

//         int[] ans = new int[nums.length];
//         for(int i =0; i<ans.length; ){
//             ans[i++] = pos.poll();
//             ans[i++] = neg.poll(); 
//         }
//         return ans;
//     }
// }


class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int posIndex = 0 , negIndex = 1;
        for(int x : nums){
            if( x > 0){
                ans[posIndex] = x;
                posIndex += 2;
            }
            else{
                ans[negIndex] = x;
                negIndex += 2;
            }
        }
        return ans;
    }
}