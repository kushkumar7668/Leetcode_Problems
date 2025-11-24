class Solution {
    public int maxSumDivThree(int[] nums) {
        ArrayList<Integer> r1 = new ArrayList<>();
        ArrayList<Integer> r2 = new ArrayList<>();

        int sum = 0;
        int ans = 0;
        for (int x : nums) {
            sum += x;
            if (x % 3 == 1)
                r1.add(x);
            else if (x % 3 == 2)
                r2.add(x);
        }

        if (sum % 3 == 0)
            return sum;

        Collections.sort(r1);
        Collections.sort(r2);

        if (sum % 3 == 1) { // if rem = 1 then remove 1 smallest from r1 or 2 smallest from r2
            int ans1 = r1.size()>=1 ? sum - r1.get(0) : 0;
            int ans2 = r2.size() >=2 ? sum - r2.get(0) - r2.get(1) : 0;
            ans = Math.max(ans1, ans2);
        }

        else if (sum % 3 == 2) { // if rem = 2 then remove 1 smallest from r2 or 2 smallest from r1
            int ans1 = r2.size() >=1 ? sum - r2.get(0) : 0;
            int ans2 = r1.size() >=2 ? sum - r1.get(0) - r1.get(1) : 0;
            ans = Math.max(ans1, ans2);
        }
        return ans;
    }
}