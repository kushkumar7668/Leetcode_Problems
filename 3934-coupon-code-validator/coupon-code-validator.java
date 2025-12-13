class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> ans = new ArrayList<>();
        Set<String> s = new HashSet<>();
        s.add("electronics");
        s.add("grocery");
        s.add("pharmacy");
        s.add("restaurant");
        
        Map<String, Integer> order = new HashMap<>();
        order.put("electronics", 0);
        order.put("grocery", 1);
        order.put("pharmacy", 2);
        order.put("restaurant", 3);

        List<String[]> valid = new ArrayList<>();

        for(int i =0 ;i<code.length; i++){
            if(!isActive[i]) continue;
            if(!s.contains(businessLine[i])) continue;
            int f =1;
            if(code[i].equals("")) continue;
            for(char ch : code[i].toCharArray()){
                if(ch == '_' || ch >='a' && ch <= 'z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9'){
                    f =1;
                }
                else{
                    f =0;
                    break;
                }
            }
            if(f==1) valid.add(new String[]{code[i], businessLine[i]});
        }
         Collections.sort(valid, (a, b) -> {
            int c = order.get(a[1]) - order.get(b[1]);
            if (c != 0) return c;
            return a[0].compareTo(b[0]);
        });

        for(String[] v : valid) ans.add(v[0]);
        return ans;
    }
}