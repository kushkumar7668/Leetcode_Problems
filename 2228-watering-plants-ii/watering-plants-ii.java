class Solution {
    public int minimumRefill(int[] plants, int A, int B) {
        int t1 = A, t2 = B, count = 0;
        int n = plants.length;
        int i = 0, j = n-1;
        while(i < j){
           
            if( A < plants[i]) {
                count++;
                A = t1;
            }
            A -= plants[i];
            i++;
    
            if(B < plants[j]){
                count++;
                B = t2;
            }
            B -= plants[j];
            j--;  
        }

        if(i == j){
            if(Math.max(A,B) < plants[i]){
                count++;
            }
        }
        return count;
    }
}