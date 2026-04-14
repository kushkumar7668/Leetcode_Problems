class Solution {
    public int kthSmallest(int[][] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = nums.length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                pq.offer(nums[i][j]);
                if(pq.size() > k) pq.poll();
            }
        }
        
        return pq.peek();
    }
}