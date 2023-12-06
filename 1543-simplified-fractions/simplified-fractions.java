class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j < i; ++j) {
                if (gcd(j, i) == 1) {
                    StringBuilder str = new StringBuilder();
                    str.append(j);
                    str.append("/");
                    str.append(i);
                    ans.add(str.toString());
                }
            }
        }
        return ans;
    }
    private int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }
}