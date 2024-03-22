class Solution {
    int req = 0;

    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        req = grid[row][col];
        helper(grid, row, col, color, visited);
        return grid;
    }

    void helper(int[][] grid, int i, int j, int target, boolean[][] visited) {
        visited[i][j] = true;
        int[] dx = { 0, -1, 0, 1 };
        int[] dy = { -1, 0, 1, 0 };
        int count = 0;
        for (int k = 0; k < 4; k++) {
            int x = i + dx[k], y = j + dy[k];
             if (x < 0 || x >= grid.length || y < 0 || y >= grid[i].length || req != grid[x][y]) {
                continue;
            }
            count++;
        }
        for (int k = 0; k < 4; k++) {
            int x = i + dx[k], y = j + dy[k];
            if (x < 0 || x >= grid.length || y < 0 || y >= grid[i].length || req != grid[x][y]) {
                continue;
            }
            if(visited[x][y] == false){
                    helper(grid, x, y, target, visited);
            }
        }
        if (count < 4){
            grid[i][j] = target;
        }
    }
}