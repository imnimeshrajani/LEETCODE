
class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int N = arr.length;
        int K = k + 1;
        int[] dp = new int[k + 1];

        for (int start = N - 1; start >= 0; start--) {
            int max = 0;
            int end = Math.min(N, start + k);

            for (int i = start; i < end; i++) {
                max = Math.max(max, arr[i]);
                dp[start % K] = Math.max(dp[start % K], dp[(i + 1) % K] + max * (i - start + 1));
            }
        }
        return dp[0];
    }
}
