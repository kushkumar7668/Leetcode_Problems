class Solution {
    public int minLength(int[] nums, int k) {
        int[] freq = new int[100001];
        int left = 0;
        int result = Integer.MAX_VALUE;
        int currSum = 0;

        for (int right = 0; right < nums.length; right++) {
            int rightElem = nums[right];
            if (freq[rightElem] == 0) {
                currSum += rightElem;
            } 

            freq[rightElem]++;

            while (currSum >= k && left <= right) {
                int leftElem = nums[left];
                if (freq[leftElem] == 1) {
                    currSum -= leftElem;
                }
                freq[leftElem]--;
                result = Math.min(result, right - left + 1);
                left++;
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
}