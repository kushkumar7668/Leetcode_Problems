class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        int n = costs.length;
        if (n == 0) return 0;

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = costs[i];
            arr[i][1] = capacity[i];
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int[] pre = new int[n];
        pre[0] = arr[0][1];
        for (int i = 1; i < n; i++) {
            pre[i] = Math.max(pre[i-1], arr[i][1]);
        }

        int maxi = 0;

        // Single item
        for (int i = 0; i < n; i++) {
            if (arr[i][0] < budget) {
                maxi = Math.max(maxi, arr[i][1]);
            }
        }

        // Two items
        for (int i = 1; i < n; i++) {

            int rem = budget - arr[i][0];
            
            if (rem <= 0) continue;
            int idx = binarySearch(arr, i - 1, rem);
            if (idx >= 0) {
                maxi = Math.max(maxi, arr[i][1] + pre[idx]);
            }
        }

        return maxi;
    }

    private int binarySearch(int[][] arr, int hi, int rem) {
        int lo = 0, ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid][0] < rem) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}