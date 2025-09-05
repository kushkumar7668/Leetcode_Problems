class Solution {
    public int addRungs(int[] rungs, int dist) {
        int  curr = 0;
        int next;
        int c = 0;
        for(int i = 0; i<rungs.length; i++){
            next = rungs[i];
            int diff = next - curr;
            if((diff) > dist){
                if(diff % dist == 0) c += diff/dist -1;
                else c += diff/dist; 
            }
            curr = next;
        }
        return c;
    }
}