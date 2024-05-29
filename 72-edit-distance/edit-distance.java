class Solution {
    public int minDistance(String word1, String word2) {
        char[] str1 = word1.toCharArray(), str2 = word2.toCharArray();
        int[][] dp = new int[str1.length + 1][str2.length + 1];
        for(int i = 1; i < str1.length + 1; i++)
            dp[i][0] = i;
        for(int i = 1; i < str2.length + 1; i++)
            dp[0][i] = i;
        for(int i = 1; i < str1.length + 1; i++) {
            for(int j = 1; j < str2.length + 1; j++) {
                dp[i][j] = (str1[i - 1] == str2[j - 1]) ? dp[i - 1][j - 1] : Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j])) + 1;
            }
        }
        return dp[str1.length][str2.length];
    }
}