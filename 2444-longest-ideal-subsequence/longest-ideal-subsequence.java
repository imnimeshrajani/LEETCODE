class Solution {
    public int longestIdealString(String s, int k) {
        int[] dp = new int[26];
        int ans = 0;
        for(char c : s.toCharArray()) {
            int val = c - 'a';
            for(int j = val; j >= 0 && j >= val - k; j--){
                dp[val] = Math.max(dp[val], dp[j] + 1);
            }
            for(int j = val + 1; j < 26 && j <= val + k; j++){
                dp[val] = Math.max(dp[val], dp[j] + 1);
            }
            ans = Math.max(ans,dp[val]);
        }
        return ans;
    }
}