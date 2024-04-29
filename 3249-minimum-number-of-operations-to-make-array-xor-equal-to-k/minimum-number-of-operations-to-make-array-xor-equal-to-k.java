class Solution {
    public int minOperations(int[] nums, int k) {
        int res = 0, ans = 0;
        for (int i : nums) res ^= i;
        if (res == k) return ans;
        while(k != 0 || res != 0) {
            if((res & 1) != (k & 1)) ans++;
            k >>= 1;
            res >>= 1;
        }
        return ans;
    }

}
