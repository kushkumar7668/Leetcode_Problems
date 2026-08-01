class Solution {
    public int distinctAverages(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length,  l = 0, r = n-1;
            HashSet<Double> set = new HashSet<>();
            while(l < r){
                double avg = (1.0*nums[l]+nums[r])/2;
                set.add(avg);
                l++;
                r--;
            }
            for(double d : set) System.out.print(d + " ");
            return set.size();

    }
}