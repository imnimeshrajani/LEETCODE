class Solution {
    int maxValue = 0;
    public int getMaximumGold(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        for(int i = 0; i < n; i++) 
            for(int j = 0; j < m; j++) 
                solve(grid, i, j, grid[i][j]);
            
        return maxValue;
    }
    void solve (int[][] grid, int i, int j, int sum) {
        if(grid[i][j] == 0) return;
        int val = grid[i][j];
        if(maxValue < sum) maxValue = sum;
        grid[i][j] = 0;
        
        if(i > 0) solve(grid, i - 1, j, sum + grid[i - 1][j]);
        if(j < grid[0].length - 1) solve(grid, i, j + 1, sum + grid[i][j + 1]);
        if(i < grid.length - 1) solve(grid, i + 1, j, sum + grid[i + 1][j]);
        if(j > 0) solve(grid, i, j - 1, sum + grid[i][j - 1]);
        
        grid[i][j] = val;
    }
}