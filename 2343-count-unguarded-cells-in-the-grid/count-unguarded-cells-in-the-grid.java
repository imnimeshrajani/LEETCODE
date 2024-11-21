class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int grid[][] = new int[m][n], ans = 0;
        for(int[] wall : walls) {
            grid[wall[0]][wall[1]] = 1;
        }
        for(int[] guard : guards) 
            grid[guard[0]][guard[1]] = 2;

        for(int[] guard : guards) {
            for(int i = guard[1] + 1; i < n; i++) {
                if(grid[guard[0]][i] == 1 || grid[guard[0]][i] == 2) break;
                grid[guard[0]][i] = 3;
            }
            for(int i = guard[1] - 1; i >= 0; i--) {
                if(grid[guard[0]][i] == 1 || grid[guard[0]][i] == 2) break;
                grid[guard[0]][i] = 3;
            }
            for(int i = guard[0] + 1; i < m; i++) {
                if(grid[i][guard[1]] == 1 || grid[i][guard[1]] == 2) break;
                grid[i][guard[1]] = 3;
            }
            for(int i = guard[0] - 1; i >= 0; i--) {
                if(grid[i][guard[1]] == 1 || grid[i][guard[1]] == 2) break;
                grid[i][guard[1]] = 3;
            }
        }
        
        for(int[] row : grid) {
            for(int col : row) {
                if(col == 0) ans++;
            }
        }
        return ans;
    }
}