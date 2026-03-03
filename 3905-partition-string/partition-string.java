class Solution {
    public List<String> partitionString(String s) {
        ArrayList<String> ans = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            sb.append(ch);
            if(!seen.contains(sb.toString())){
                ans.add(sb.toString());
                seen.add(sb.toString());
                sb = new StringBuilder();
            }
            
        }
            
        return ans;
    }
}