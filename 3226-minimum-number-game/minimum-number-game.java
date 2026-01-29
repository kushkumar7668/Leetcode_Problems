// class Solution {
//     public int[] numberGame(int[] nums) {
//         Arrays.sort(nums);
//         for(int i = 0; i<nums.length-1; i+=2){
//             int temp = nums[i];
//             nums[i] = nums[i+1]; 
//             nums[i+1] = temp;
//         }
//         return nums;
//     }
// }


class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n : nums) {
            pq.offer(n);
        }

        int i=0;
        while(pq.size()>1) {
            int a = pq.poll();
            int b = pq.poll();
            nums[i++] = b;
            nums[i++] = a;
        }
        if(!pq.isEmpty()) {
            nums[nums.length-1] = pq.poll();
        }
        return nums;
    }
}