class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();

        helper(nums, 0, ll, res);
        return res;        
    }

    // private void helper(int[] nums, int index, List<Integer> ll, List<List<Integer>> res) {
    //    res.add(new ArrayList<>(ll));

    //    for(int i = index; i<nums.length; i++){
    //     ll.add(nums[i]);
    //     helper(nums, i+1, res, ll);
    //     ll.remove(ll.size()-1);

    //    }
    // }    

    private void helper(int[] nums, int index, List<Integer> ll, List<List<Integer>> res){
        if(index == nums.length){
            res.add(new ArrayList<>(ll));
            return;
        }

        ll.add(nums[index]);
        helper(nums, index+1, ll, res);

        ll.remove(ll.size() -1);
        helper(nums, index+1, ll, res);
    }
}