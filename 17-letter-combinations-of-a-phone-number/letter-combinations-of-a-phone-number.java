class Solution {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String que) {
        List<String> ll = new ArrayList<>();
        if(que.length() == 0) return ll;
        Print(que, "", ll);
        return ll;
    }
    public static void Print(String que, String ans, List<String> ll){
        if(que.length() == 0){
            // System.out.println(ans);
            ll.add(ans);
            return;
        }
        char ch = que.charAt(0);
        String getString = key[ch - '0'];
        for(int i = 0; i < getString.length(); i++ ){
            Print(que.substring(1), ans + getString.charAt(i), ll);
        }
    }
}
