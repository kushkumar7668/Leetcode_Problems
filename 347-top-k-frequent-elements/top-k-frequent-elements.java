class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> a[1] - b[1]
        );

        for(int num : map.keySet()){
            int f = map.get(num);
            pq.add(new int[]{num, f});

            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] ans = new int[k];

        for(int i = 0;i<k; i++){
            int[] a = pq.poll();
            ans[i] = a[0];
        }
        return ans;
        
    }
}