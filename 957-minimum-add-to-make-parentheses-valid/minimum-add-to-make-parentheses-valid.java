class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        int c =0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == '('){ 
                st.push('(');
            }
            else if(!st.isEmpty() && (arr[i] == ')' && st.peek() == '(')) {
                st.pop();
            }
            else if(st.isEmpty() && arr[i] == ')'){
                c++;
            }

        }
        while(!st.isEmpty()){
            c++;
            st.pop();
        }
        return c;
    }
}