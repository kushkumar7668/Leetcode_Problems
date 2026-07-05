class Solution {
    public int maxDigitRange(int[] nums) {
        int max = Integer.MIN_VALUE;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int x : nums){
            int r = range(x);
            map.computeIfAbsent(r, range -> new ArrayList<>()).add(x);
            max = Math.max(max, r);
        }

        List<Integer> ll = map.get(max);
        int sum = 0;
        for(int x : ll) sum+=x;
        return sum;

    }
    public int range(int x){
        int l = 0, s = 9;
        while(x > 0){
            int d = x%10;
            l = Math.max(l, d);
            s = Math.min(s, d);
            x /= 10;
        }
        return l - s;
    }
}