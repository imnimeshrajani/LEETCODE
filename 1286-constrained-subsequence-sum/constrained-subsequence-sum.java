class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        int[] dp = new int[nums.length];
        int l = 0, r = 1, ans = Integer.MIN_VALUE;
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(dp[l] + nums[i], nums[i]);
            while (r > l && dp[r - 1] < nums[i])
                r--;

            dp[r++] = nums[i];
            if (i >= k && dp[l] == nums[i - k])
                l++;
        }
        for (int i : nums)
            ans = Math.max(ans, i);

        return ans;
    }
}