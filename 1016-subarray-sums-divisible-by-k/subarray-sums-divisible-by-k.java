public class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        //  USING FREQUENCY array ->
        int[] freq = new int[k];
        int count = 0, rem = 0, sum = 0;
        freq[0] = 1;
        for (int num : nums) {
            sum += num;
            rem = sum % k;
            if (rem < 0)
                rem += k;
            count += freq[rem];
            freq[rem]++;
        }
        return count;

        // using HASHmap ->

        // // Initialize count of subarrays, prefix sum, and hash map for remainders
        // int count = 0;
        // int prefixSum = 0;
        // HashMap<Integer, Integer> prefixMap = new HashMap<>();
        // prefixMap.put(0, 1); // To handle subarrays that start from the beginning

        // for (int num : nums) {
        //     // Update prefix sum
        //     prefixSum += num;

        //     // Calculate the remainder of the prefix sum divided by k
        //     int mod = prefixSum % k;

        //     // Adjust negative remainders to be positive
        //     if (mod < 0) {
        //         mod += k;
        //     }

        //     // If this remainder has been seen before, it means there are subarrays ending here that are divisible by k
        //     if (prefixMap.containsKey(mod)) {
        //         count += prefixMap.get(mod);
        //         prefixMap.put(mod, prefixMap.get(mod) + 1);
        //     } else {
        //         prefixMap.put(mod, 1);
        //     }
        // }

        // return count; // Total number of subarrays divisible by k
    }
}