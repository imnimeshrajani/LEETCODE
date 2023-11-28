class Solution {
    public int numberOfWays(String corridor) {
        char[] s = corridor.toCharArray();
        long j = 0, k = 0, ans = 1, mod = 1000000007;
        for (int i = 0; i < s.length; i++) {
            if (s[i]== 'S') {
                if (++k > 2 && k % 2 == 1)
                    ans = ans * (i - j) % mod;
                j = i;
            }
        }
        return (k % 2 == 0 && k > 0)? (int)ans : 0;
    }
}