class Solution {
    public int scoreDifference(int[] nums) {
        int p1 = 0, p2 = 0;
        int f = 0; // f==0 player1 active else player 2 active

        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] % 2 == 1) f = f ^ 1;

            if (i % 6 == 5) f = f ^ 1;

            if (f == 1) p2 += nums[i];
            
            else p1 += nums[i];
            
        }
        return (p1 - p2);
    }
}