class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();

        helper(nums, 0, res, ll);
        return res;        
    }

    private void helper(int[] nums, int index, List<List<Integer>> res, List<Integer> ll) {
       res.add(new ArrayList<>(ll));

       for(int i = index; i<nums.length; i++){
        ll.add(nums[i]);
        helper(nums, i+1, res, ll);
        ll.remove(ll.size()-1);

       }
    }    
}