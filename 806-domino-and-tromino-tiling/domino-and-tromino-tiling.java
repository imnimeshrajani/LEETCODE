class Solution {
    public int numTilings(int n) {
        int MOD = 1000000007;
        if(n < 3) return n;
        int ans = 2, prev1 = 1, prev2 = 1, prev3 = 1;
        for(int i = 3; i <= n; i++) {
            prev1 = ans;
            ans = (((prev1 * 2) % MOD) + prev3) % MOD;
            prev3 = prev2;
            prev2 = prev1;
            prev1 = ans;
        }
        return ans;
    }
}