class Solution {
    public int calculate(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char op = '+';
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                sb.append(ch);
                
            }
            if (!Character.isDigit(ch) && ch != ' ' || i == n - 1) {
                if (op == '+') {
                    int num = Integer.parseInt(sb.toString());
                    st.push(num);
                    sb = new StringBuilder();
                } else if (op == '-') {
                    int num = Integer.parseInt(sb.toString());
                    st.push(-num);
                    sb = new StringBuilder();

                } else if (op == '*') {
                    int num = Integer.parseInt(sb.toString());
                    st.push(st.pop() * num);
                    sb = new StringBuilder();

                } else if (op == '/') {

                    int num = Integer.parseInt(sb.toString());
                    st.push(st.pop() / num);
                    sb = new StringBuilder();

                }
                op = ch;
                sb = new StringBuilder();
            }
        }

        if (sb.length() != 0)
            st.push(Integer.parseInt(sb.toString()));
        int result = 0;
        while (!st.isEmpty()) {
            result += st.pop();
        }
        return result;

    }
}