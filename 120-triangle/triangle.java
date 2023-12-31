class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }
        return minPathSum(0, 0, n, triangle, dp);
    }
    public static int minPathSum(int i, int j, int n, List<List<Integer>> triangle, int[][] dp){
        if(j == n) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        List<Integer> list = triangle.get(j);
        int val = list.get(i);
        dp[i][j] = val+Math.min(minPathSum(i, j+1, n, triangle, dp), minPathSum(i+1, j+1, n, triangle, dp));
        return dp[i][j];
    }
}