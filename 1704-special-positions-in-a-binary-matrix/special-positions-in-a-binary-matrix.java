class Solution {
    public int numSpecial(int[][] mat) {
        int[] row = new int[mat.length];
        for(int i =0; i<mat.length; i++){
            int c = 0;
            for(int j = 0; j<mat[0].length; j++){
                if(mat[i][j] == 1) c++;
            }
            if(c == 1) row[i] = 1;
        }

        int[] col = new int[mat[0].length];
        for(int j =0; j<mat[0].length; j++){
            int c = 0;
            for(int i = 0; i<mat.length; i++){
                if(mat[i][j] == 1) c++;
            }
            if(c == 1) col[j] = 1;
        }
        int ans = 0;
        for(int i =0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                if(mat[i][j] == 1 && row[i] == 1 && col[j] == 1){
                    ans++;
                    break;
                }

                    
            }
        }
        return ans;
    }
}