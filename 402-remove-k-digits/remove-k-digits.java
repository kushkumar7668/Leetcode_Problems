class Solution {
    public String removeKdigits(String s, int k) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            while(!st.isEmpty() && st.peek() > ch && k >0){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k >0) {
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        while(sb.length() > 1 && sb.charAt(sb.length()-1) == '0') sb.deleteCharAt(sb.length()-1);
        return sb.length() == 0 ? "0" : sb.reverse().toString();
    }
}