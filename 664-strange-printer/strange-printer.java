// class Solution {
//     public int strangePrinter(String s) {
//         char[] arr = s.toCharArray();
//         int n = arr.length, dp[][] = new int[n][n];
//         for(int i = 0; i < n; i++) {
//             dp[i][i] = 1;
//             for(int j = i - 1; j >= 0; j--) {
//                 dp[i][j] = dp[i][j + 1] + 1;
//                 for(int k = i; k > j; k--)
//                     if(arr[k] == arr[j])
//                         dp[i][j] = Math.min(dp[i][j], dp[i][k] + ((k - 1 >= j + 1) ? dp[k - 1][j + 1] : 0));
//             }
//         }
//         return dp[n - 1][0];
//     }
// }

class Solution {
    public int strangePrinter(String s) {
        char[] sc = s.toCharArray();
        final int n = removeDuplicates(sc);
        if (n <= 1)  return n;
        return dfs(0, n - 1, sc, new int[n][n]);
    }
    
    
    private int dfs(int left, int right, char[] sc, int[][] memo) {
        if (left >= right)  return (left == right) ? 1 : 0;
        if (memo[left][right] != 0)  return memo[left][right];
        int letter = sc[left], answer = 1 + dfs(left + 1, right, sc, memo);
        for (int k = left + 1; k <= right; k++) 
            if (sc[k] == letter) 
                answer = Math.min(answer, dfs(left+1, k - 1, sc, memo) + dfs(k, right, sc, memo));
        return memo[left][right] = answer;
    }
    
    
    private int removeDuplicates(char[] sc) {
        int scOutIdx = 0;
        char prev = 0;
        for (char c : sc) 
            if (c != prev) 
                prev = sc[scOutIdx++] = c;
        return scOutIdx;
    }
}