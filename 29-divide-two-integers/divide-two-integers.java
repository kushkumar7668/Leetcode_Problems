class Solution {
    int HALF_INT_MIN = Integer.MIN_VALUE >> 1;
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        int negatives = 2;
        if (dividend > 0) {
            dividend = -dividend;
            negatives--;
        }
        if (divisor > 0) {
            divisor = -divisor;
            negatives--;
        }
        int ret = 0;
        List<Integer> powers = new ArrayList<>();
        List<Integer> values = new ArrayList<>();
        int value = divisor;
        int power = 1;
        while (value >= dividend) {
            powers.add(power);
            values.add(value);

            if (value < HALF_INT_MIN) break;
            power = power << 1;
            value = value << 1;
            // you can also do:
            // power += power;
            // value += value;
        }

        for (int i = powers.size() - 1; i >= 0; i--) {
            if (dividend <= values.get(i)) {
                ret += powers.get(i);
                dividend -= values.get(i);
            }
        }

        return negatives == 1 ? -ret : ret;
        
    }
}