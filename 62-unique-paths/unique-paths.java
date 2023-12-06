class Solution {
    public int uniquePaths(int m, int n) {
        if(m < n) {
            m = m ^ n;
            n = m ^ n;
            m = m ^ n;
        }
        long ans = 1, j = 1;
        for(int i = m; i <= m + n - 2; i++, j++){
            ans *= i;
            ans /= j;
        }
        return (int) ans;
    }
}