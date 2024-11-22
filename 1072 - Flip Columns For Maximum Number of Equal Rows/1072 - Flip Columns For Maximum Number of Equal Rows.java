class Solution 
{
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int maxCount = 0;

        for (int i = 0; i < matrix.length; ++i) {
            int count = 1;
            int[] flippedRow = flip(matrix[i]);

            for (int j = i + 1; j < matrix.length; ++j) {
                if (isEqual(matrix[i], matrix[j]) || isEqual(flippedRow, matrix[j])) {
                    ++count;
                }
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    private int[] flip(int[] row) {
        int[] flippedRow = new int[row.length];
        for (int i = 0; i < row.length; ++i) {
            flippedRow[i] = 1 - row[i];
        }
        return flippedRow;
    }

    private boolean isEqual(int[] row1, int[] row2) {
        return Arrays.equals(row1, row2);
    }
}
