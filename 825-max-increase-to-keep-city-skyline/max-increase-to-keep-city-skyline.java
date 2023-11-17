class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int ans = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                int rMax = Integer.MIN_VALUE, cMax = Integer.MIN_VALUE;
                for(int k = 0; k < grid[j].length; k++){
                    rMax = Math.max(rMax, grid[i][k]);
                }
                for(int k = 0; k < grid.length; k++){
                    cMax = Math.max(cMax, grid[k][j]);
                }
                ans += Math.min(rMax,cMax) - grid[i][j];
            }
        }
        return ans;
    }
}