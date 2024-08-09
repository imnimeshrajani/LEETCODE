class Solution {
    int ans = 0;
    public int numMagicSquaresInside(int[][] grid) {
        if(grid.length < 3 || grid[0].length < 3) return ans;
        for(int i = 0; i < grid.length - 2; i++) {
            for(int j = 0; j < grid[i].length - 2; j++) {
                helper(grid, i, j);
            }
        }
        return ans;
    }

    void helper(int[][] grid, int row, int col) {
        int[] rowSum = new int[3], colSum = new int[3];
        boolean[] arr = new boolean[10];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                int val = grid[row + i][col + j];
                rowSum[i] += val;
                colSum[j] += val;
                if(val > 9 || val == 0 || arr[val]) return;
                arr[val] = true;
            }
        }
        for(int i = 1; i < 3; i++)
            if(rowSum[i] != rowSum[i - 1] || rowSum[i] != colSum[i - 1] || colSum[i] != colSum[i - 1]) return;
        
        int val = grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2];
        if(val != grid[row][col + 2] + grid[row + 1][col + 1] + grid[row + 2][col] || val != rowSum[0]) return;
        ans++;
    }
}