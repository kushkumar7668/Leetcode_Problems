class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] arr1, int[][] arr2) {
        int p1 = 0, p2 = 0;
        List<List<Integer>> ans = new ArrayList<>();
        
        while(p1 < arr1.length && p2 < arr2.length){
            List<Integer> ll = new ArrayList<>();
            int s = Math.min(arr1[p1][0] , arr2[p2][0]);
            int v = arr1[p1][1] + arr2[p2][1];
            ll.add(s);
            ll.add(v);
            ans.add(ll);
            if(arr1[p1][0] < arr2[p2][0]) p1++;
            else if(arr1[p1][0] > arr2[p2][0]) p2++;
            else{
                p1++;
                p2++;
            }
        }
        while(p1 < arr1.length){
            List<Integer> ll = new ArrayList<>();
            ll.add(arr1[p1][0]);
            ll.add(arr1[p1][1]);
            p1++;
            ans.add(ll);
            
        }
        while(p2 < arr2.length){
            List<Integer> ll = new ArrayList<>();
            ll.add(arr2[p2][0]);
            ll.add(arr2[p2][1]);
            p2++;
            ans.add(ll);
            
        }
        return ans;
    }
}