class Solution {
    public int countTestedDevices(int[] arr) {
        int c = 0, d = 0;
        for(int x : arr){
            if((x-d) > 0){
                c++;
                d++;
            }
        }
        return c;
    }
}