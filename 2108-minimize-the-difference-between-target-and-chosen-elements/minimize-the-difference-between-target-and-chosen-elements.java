class Solution {
    public int minimizeTheDifference(int[][] mat, int target) {
        return solve(mat, 0, target, 0, new Integer[mat.length][4900]);
    }
    int solve(int[][] mat, int row, int target, int sum, Integer[][] dp) {
        if(row == mat.length) 
            return Math.abs(target - sum);
        
        if(dp[row][sum] != null) return dp[row][sum];
        int ans = Integer.MAX_VALUE;
        for(int col = 0; col < mat[0].length; col++) {
            ans = Math.min(ans, solve(mat, row + 1, target, sum + mat[row][col], dp));
        }
        return dp[row][sum] = ans;
    }
}