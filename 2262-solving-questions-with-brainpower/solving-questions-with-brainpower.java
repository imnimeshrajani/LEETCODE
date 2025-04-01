class Solution {
    public long mostPoints(int[][] questions) {
        long[] dp = new long[questions.length];
        return helper(questions, dp, 0);
    }

    private long helper(int[][] que, long[] dp, int idx) {
        if(idx >=que.length) return 0;
        if(dp[idx] != 0) return dp[idx];
        int ans = que[idx][0], nextIdx = idx + que[idx][1] + 1;
        return dp[idx] = Math.max(helper(que, dp, idx + 1), que[idx][0] + helper(que, dp, nextIdx));
    } 
}