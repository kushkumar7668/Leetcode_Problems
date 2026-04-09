class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        for(int row = 0; row < numRows; row++){
            ll = new ArrayList<>();
            int next = 1, prev = 1;
            for(int col = 0; col <= row; col++){ //this loop has to run row +1 times as each contains row+1 elements in it.
                ll.add(next);
                next = (prev * (row - col))/(col+1); 
                prev = next;
            }
            res.add(ll);
        }
        return res;
    }
}