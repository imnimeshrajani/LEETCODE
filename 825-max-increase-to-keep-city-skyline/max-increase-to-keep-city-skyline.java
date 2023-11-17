class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] cMax = new int[grid.length];
        int[] rMax = new int[grid[0].length];
        int cmIndex = 0, rmIndex = 0, ans = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                rMax[j] = Math.max(rMax[j], grid[j][i]);
                cMax[j] = Math.max(cMax[j], grid[i][j]);
            }
        }
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                ans += Math.abs(Math.min(rMax[i], cMax[j]) - grid[i][j]);
            }
        }
        return ans;
    }
}