class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        helper(nums, 0, ll, ans);
        return ans;
    }

    public void helper(int[] nums, int index, List<Integer> ll, List<List<Integer>> ans){
        if(ll.size() == nums.length){
            ans.add(new ArrayList<>(ll));
        }
        for(int i = 0; i<nums.length; i++){
            if(ll.contains(nums[i])) continue;
            ll.add(nums[i]);
            helper(nums, i+1, ll, ans);
            ll.remove(ll.size()-1);
        }
        
    }
}