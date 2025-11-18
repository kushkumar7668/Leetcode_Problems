// class Solution {
//     public double average(int[] salary) {
//         Arrays.sort(salary);
//         double sum = 0.0;    // s = 0;
//         for(int i = 1; i<salary.length-1; i++){
//             sum += salary[i];
//         }
//         return sum / (salary.length-2);
//     }
// }

//  without sorting ->

class Solution {
    public double average(int[] a) {
        double s = 0;
        int max = a[0], min = a[0];
        for (int i = 0; i < a.length; i++) {
            s += a[i];
            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
        }
        s -= max + min;
        return s / (a.length - 2);
    }
}