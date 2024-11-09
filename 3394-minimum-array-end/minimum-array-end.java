class Solution {
    public long minEnd(int n, int x) {
        long ans = x, remaining = n - 1, position = 1;
        while(remaining > 0) {
            if((x & position) == 0) {
                ans |= (remaining & 1) * position;
                remaining >>= 1;
            }
            position <<= 1;
        }
        return ans;
    }
}