class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length, start = 0;
        long rs = 0, sum = 0;
        for (int i = 0; i < n; ++i) {
            sum += nums[i];
            while (sum * (i - start + 1) >= k) {
                sum -= nums[start++];
            }
            rs += i - start + 1;
        }
        return rs;
    }
}