class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        if(n%2==1){
            arr[0] = 0;
            int k = n;
            for(int i =1;i<n;i+=2){
                arr[i]= k;
                arr[i+1] = -k;
                k--;
            }
            
        }
        else{
            int k = n;
            for(int i =0;i<n;i+=2){
                arr[i]= k;
                arr[i+1] = -k;
                k--;
            }
        }
        return arr;
    }
}