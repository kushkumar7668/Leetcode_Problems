class Solution {
    public String removeOuterParentheses(String s) {
        Stack<String> st = new Stack<>();
        int c1 = 0, c2 =0;
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){

            sb.append(ch);
            if(ch == '(') c1++;
            else if(ch == ')') c2++;

            if(c1 == c2 && c1 !=0){
                st.push(sb.toString());
                c1 = 0;
                c2 =0;
                sb = new StringBuilder("");
            }

        }
        StringBuilder ans = new StringBuilder();
        for(int i =0; i<st.size(); i++){
            String str = st.get(i);
            ans.append(str.substring(1,str.length()-1));
        }

        return ans.toString();
    }
}