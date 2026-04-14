class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while(p1 < nums1.length && p2 < nums2.length){
            if(nums1[p1][0] == nums2[p2][0]){
                int x = nums1[p1][1] + nums2[p2][1];
                ans.add(Arrays.asList(nums1[p1][0] , x));
                p1++;
                p2++;
            }
            else if(nums1[p1][0] < nums2[p2][0]){
                ans.add(Arrays.asList(nums1[p1][0], nums1[p1][1]));
                p1++;
            }
            else{
                ans.add(Arrays.asList(nums2[p2][0], nums2[p2][1]));
                p2++;

            }
        }
        while(p1 < nums1.length){
            ans.add(Arrays.asList(nums1[p1][0], nums1[p1][1]));
            p1++;
        }
        while(p2 < nums2.length){
            ans.add(Arrays.asList(nums2[p2][0], nums2[p2][1]));
            p2++;
        }
        int[][] a = new int[ans.size()][2];
        for(int i = 0; i<ans.size(); i++){
            a[i][0] = ans.get(i).get(0);
            a[i][1] = ans.get(i).get(1);
        }
        return a;
    }
}