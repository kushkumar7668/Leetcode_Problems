class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<students.length; i++) {
            q.offer(students[i]);       //students
            st.push(sandwiches[sandwiches.length -i -1]); //sandwiches
        }
        
        while(!st.isEmpty()){
            if(!q.contains(st.peek())) return st.size();
            int x = q.poll();
            if(x == st.peek()){
                st.pop();
            }

            else{
                q.offer(x);
            }
        }

        
        return 0;
    }
}