class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[] maxCol = new int[matrix[0].length];
        for(int i =0; i<matrix[0].length; i++){
            int max = -1;
            for(int j =0; j<matrix.length; j++){
                max = Math.max(max, matrix[j][i]); 
            }
            maxCol[i] = max;
        }

        for(int i =0; i<matrix[0].length; i++){
            for(int j =0; j<matrix.length; j++){
                if(matrix[j][i] == -1){
                    matrix[j][i] = maxCol[i];
                }
            }
        }

        return matrix;

    }
}