class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length, m = grid[0].length, sum = 0;
        int[] colSum = new int[m], rowSum = new int[n];
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (var j : grid[i]) {
                sum +=j;
            }
            rowSum[i] = (2*sum) - m;
        }
        for (int i = 0; i < m; i++) {
            sum = 0;
            for(int[] j : grid){
                sum += j[i];
            }
            colSum[i] = (2*sum) - n;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                grid[i][j] = rowSum[i] + colSum[j];
            }
        }
        return grid;
    }
}