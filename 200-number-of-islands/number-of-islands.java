class Solution {
    int ans = 0;
    public int numIslands(char[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    findArea(grid, i, j);
                    ans++;
                }
            }
        }
        return ans;
    }
    void findArea(char[][] grid, int i, int j) {
        if(grid[i][j] == '0') return;
        grid[i][j] = '0';
        if(j < grid[i].length - 1) findArea(grid, i, j+1);
        if(j > 0) findArea(grid, i, j-1);
        if(i > 0) findArea(grid, i-1, j);
        if(i < grid.length - 1) findArea(grid, i+1, j);
        
    }
}