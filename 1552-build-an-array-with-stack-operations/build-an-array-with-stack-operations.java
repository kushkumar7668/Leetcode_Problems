class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> ans = new ArrayList<>();
        int j = 0;
        for(int i =1; i<=n; i++){
            if(i == target[j]){
                ans.add("Push");
                j++;
            }
            else if (i != target[j]) {
                ans.add("Push");
                ans.add("Pop");
            }
            if(j == target.length) return ans;
        }
        return ans;
    }
}