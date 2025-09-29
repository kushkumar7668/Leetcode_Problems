class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        revRow_wise(matrix);
    }
    public void transpose(int[][] arr){
        for(int i=0;i<arr[0].length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public void revRow_wise(int[][] arr){
        for(int row=0;row<arr.length;row++){
            int i=0;
            int j=arr[0].length-1;
            while(i<j){
                int temp=arr[row][i];
                arr[row][i]=arr[row][j];
                arr[row][j]=temp;
                i++;
                j--;
            }
        }
    }
}