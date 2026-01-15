class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);

        int h = 0, ch = 0;
        for (int i = 1; i < hBars.length; i++) {
            if (hBars[i] == hBars[i - 1] + 1)
                ch++;
            else {
                ch = 0;
            }

            h = Math.max(h, ch); //can't take Math.max() inside if or else as it eill not check maxlength at the end of array
        }

        int cv = 0, v = 0;
        for (int i = 1; i < vBars.length; i++) {
            if (vBars[i] == vBars[i - 1] + 1)
                cv++;
            else {
                cv = 0;
            }

            v = Math.max(v, cv);

        }

        int side = Math.min(h + 2, v + 2);
        return side * side;

    }
}