class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int c = Integer.MIN_VALUE;
        st.push(nums[nums.length-1]);
        for(int i = nums.length-2; i>=0; i--){
            if(nums[i] < c) return true;
            while(!st.isEmpty() && st.peek() < nums[i]){
                c = st.peek();
                st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}