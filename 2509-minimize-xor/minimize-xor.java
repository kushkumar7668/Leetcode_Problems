class Solution {
    public int minimizeXor(int num1, int num2) {

        int setbit = 0;
        while (num2 > 0) {
            num2 = num2 & (num2 - 1);
            setbit++;
        }

        int x = 0;
         // try to reduce count of setbit in num1 from left to right beacuse x must contain all set bit 1 that were setbit in num1 to be minimized 
        // doesn't check for MSB because MSB will always be zero for all positive numbers

        for (int i = 30; i >= 0; i--) {
            int mask = 1 << i;

            if ((num1 & mask) != 0) {
                x |= mask; // x= x | mask;
                setbit--;
                if (setbit == 0) {
                    return x;
                }
            }

        }
        // since setbitcount is not zero till now
        //fill unsetbit of num1 in x from right to left to that minimum x is genearted ->

        for (int i = 0; i <= 30; i++) {
            int mask = 1 << i;
            if ((num1 & mask) == 0) {
                x |= mask; // x = x | mask
                setbit--;
            }
            if (setbit == 0)
                return x;
        }

        return 0;
    }
}