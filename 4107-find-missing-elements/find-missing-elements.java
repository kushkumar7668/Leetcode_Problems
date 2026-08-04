class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int k = nums[0];
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i = 0; i<= nums.length-1; i++){
            while(k != nums[i]) ll.add(k++);
            k = nums[i]+1;
        }
        return ll;
    }
}