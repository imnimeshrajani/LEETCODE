class Solution {
    public int strangePrinter(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length, dp[][] = new int[n][n];
        for(int i = 0; i < n; i++) {
            dp[i][i] = 1;
            for(int j = i - 1; j >= 0; j--) {
                dp[i][j] = dp[i][j + 1] + 1;
                for(int k = i; k > j; k--)
                    if(arr[k] == arr[j])
                        dp[i][j] = Math.min(dp[i][j], dp[i][k] + ((k - 1 >= j + 1) ? dp[k - 1][j + 1] : 0));
            }
        }
        return dp[n - 1][0];
    }
}