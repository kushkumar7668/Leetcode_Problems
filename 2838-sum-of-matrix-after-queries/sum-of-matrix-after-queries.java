class Solution {
    public long matrixSumQueries(int n, int[][] queries) {
        int rowSeenCount = 0, colSeenCount = 0;
        boolean[] rowSeen = new boolean[n];
        boolean[] colSeen = new boolean[n];
        long sum = 0;
        for (int qi = queries.length - 1; qi >= 0; qi--) {
            int type = queries[qi][0], index = queries[qi][1], val = queries[qi][2];
            if (type == 0 && !rowSeen[index]) {
                rowSeenCount++;
                rowSeen[index] = true;
                sum += (n - colSeenCount) * val;
                //  This row has n columns.
                //  But some columns may have already been finalized by later column updates (counted in colSeenCount).
                //  So only (n - colSeenCount) cells are still “unclaimed” in this row.
            }
            if (type == 1 && !colSeen[index]) {
                colSeenCount++;
                colSeen[index] = true;
                sum += (n - rowSeenCount) * val;
                // This column has n rows.
                //  But some rows may have already been finalized by later row updates (counted in rowSeenCount).
                //  So only (n - rowSeenCount) cells are still “unclaimed” in this column

            }
        }
        return sum;
    }
}