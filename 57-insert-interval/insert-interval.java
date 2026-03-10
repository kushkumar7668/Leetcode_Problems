import java.util.*;
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int m = intervals.length, n = 2;
        List<int[]> ll = new ArrayList<>();
        boolean inserted = false;
        for(int i =0; i<m; i++){
            if(intervals[i][1] < newInterval[0]){
               ll.add(new int[]{intervals[i][0], intervals[i][1]});
            }
            
            else if(intervals[i][0] > newInterval[1]){
                if(!inserted){
                    ll.add(new int[]{newInterval[0], newInterval[1]});
                    inserted = true;
                }
                ll.add(new int[]{intervals[i][0], intervals[i][1]});
            }
            
            // overlaping condition->
            else{
                newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            }
        }

        if(!inserted){
            ll.add(new int[]{newInterval[0], newInterval[1]});
        }
        
        int[][] ans = new int[ll.size()][2];
        
        for(int i =0; i<ll.size(); i++){
            ans[i][0] = ll.get(i)[0];
            ans[i][1] = ll.get(i)[1];
        }

        
        
        return ans;
    }
}