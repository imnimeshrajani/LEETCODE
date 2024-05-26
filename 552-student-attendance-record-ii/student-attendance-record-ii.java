class Solution {
    int mod = 1000000007;
    public int checkRecord(int n) {
        int[][] dp = new int[2][3];
        for(int[] arr : dp) Arrays.fill(arr, 1);
        for(int i = 1; i <= n; i++) {
            int[][] arr = new int[2][3];
            for(int a = 0; a < 2; a++) {
                for(int l = 0; l < 3; l++) {
                    arr[a][l] += dp[a][2];
                    arr[a][l] %= mod;
                    if(a > 0) {
                        arr[a][l] += dp[a - 1][2];
                        arr[a][l] %= mod;
                    }
                    if(l > 0) { 
                        arr[a][l] += dp[a][l - 1];
                        arr[a][l] %= mod;
                    }
                }
            }
            dp = arr;
        }
        return dp[1][2];
    }

}