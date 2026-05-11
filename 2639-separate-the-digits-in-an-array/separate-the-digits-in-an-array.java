class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        for(int x : nums){
            String s = Integer.toString(x);
            for(char ch : s.toCharArray()){
                ll.add(ch-'0');
            }
        }
        int i = 0;
        int[] ans = new int[ll.size()];
        for(int x: ll) ans[i++] = x;
        return ans;
    }
}