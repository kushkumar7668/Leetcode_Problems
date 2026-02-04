class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        ArrayList<Integer> ll = new ArrayList<>();
        int j =0;
        Set<Integer> set = new HashSet<>();
        for(int i = nums.length-1; i>= 0; i--){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                if(j == k) break; 
                ll.add(nums[i]);
                j++;
            }
        }
        int[] arr = new int[ll.size()];
        for(int i =0 ;i<ll.size(); i++){
            arr[i] = ll.get(i);
        }
        return arr;
    }
}