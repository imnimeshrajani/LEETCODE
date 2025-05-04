class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[][] dp = new int[10][10];
        int ans = 0;
        for(int[] dom : dominoes) {
            if(dp[dom[1]][dom[0]] > 0)
                dp[dom[1]][dom[0]]++;
            else dp[dom[0]][dom[1]]++;
        }
        for(int[] arr : dp) 
            for(int val : arr) 
                if(val > 1) ans += val * (val - 1) / 2;
        return ans;
    }
}