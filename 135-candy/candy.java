// class Solution {
//     public int candy(int[] ratings) {
//         int n = ratings.length;
//         int total = 0;
//         int give = 1;
//         if(ratings[0]<ratings[1]){
//             total+=1;
//         } else{
//             total+=2;
//         }
//         for(int i = 1; i<ratings.length-1; i++){
//             if(ratings[i-1]<=ratings[i]){
//                 give++;
//             }
//             else{
//                 give = 1;
//             }
//             total+=give;
        
//         }
//         if(ratings[n-1] > ratings[n-2]){
//             total += give+1;
//         }
//         else{
//             total += 1;
//         }
//         return total;
//     }
// }


class Solution {
    public int candy(int[] ratings){
        int[] c = new int[ratings.length];
        Arrays.fill(c,1);

        for(int i = 1 ;i< ratings.length; i++){
            if(ratings[i] > ratings[i-1]){
                c[i] = c[i-1]+1;
            }
        }
        for(int i = ratings.length-2; i>=0; i--){
            if(ratings[i] > ratings[i+1]){
                c[i] = Math.max(c[i], c[i+1] +1);
            }
        }
        int min =0;
        for(int i : c){
            min += i;
        }
        return min;
    }
}