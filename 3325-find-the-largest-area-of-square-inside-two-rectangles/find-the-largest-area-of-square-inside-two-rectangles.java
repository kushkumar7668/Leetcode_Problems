class Solution {
    public long largestSquareArea(int[][] a, int[][] b) {
        int n = a.length;
        long side = 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int bottomleftX   = Math.max(a[i][0], a[j][0]);
                int toprightX = Math.min(b[i][0], b[j][0]);
                int width = toprightX - bottomleftX;

                int bottomleftY = Math.max(a[i][1], a[j][1]);
                int toprightY = Math.min(b[i][1], b[j][1]);
                int hight = toprightY - bottomleftY;

                if(width >0 && hight>0){
                    side = Math.min(width, hight);
                    ans = Math.max(ans, side*side);
                }
            }
        }
        return ans;
    }
}