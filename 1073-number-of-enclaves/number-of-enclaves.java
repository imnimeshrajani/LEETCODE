class Solution {
    public int numEnclaves(int[][] grid) {
        for (int i = 0; i < grid[0].length; i++) {
            helper(grid, 0, i);
            helper(grid, grid.length - 1, i);
        }
        for (int i = 0; i < grid.length; i++) {
            helper(grid, i, grid[0].length - 1);
            helper(grid, i, 0);
        }
        int ans = 0;
        for (int[] i : grid) 
            for (int j : i) 
                ans += j;
                
        return ans;
    }

    void helper(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0)
            return;
        grid[i][j] = 0;
        helper(grid, i + 1, j);
        helper(grid, i, j + 1);
        helper(grid, i - 1, j);
        helper(grid, i, j - 1);
    }
}