class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] colSum = new int[grid[0].length], rowSum = new int[grid.length];
        int n = grid.length, m = grid[0].length, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (var j : grid[i]) {
                if(j == 0) sum -=1; 
                else sum +=1;
            }
            rowSum[i] = sum;
        }
        for (int i = 0; i < m; i++) {
            sum = 0;
            for (var j : grid) {
                if(j[i] == 0) sum -=1; 
                else sum +=1;
            }
            colSum[i] = sum;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                grid[i][j] = rowSum[i] + colSum[j];
            }
        }
        return grid;
    }
}