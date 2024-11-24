class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long ans = 0, negative = 0;
        int min = Integer.MAX_VALUE;
        for(int[] row : matrix) {
            for(int col : row) {
                if(col < 0) negative++;
                int max = Math.abs(col);
                ans += max;
                if(min > max) min = max;
            }
        }
        return (negative % 2 == 0) ? ans : ans - 2 * min;
    }
}