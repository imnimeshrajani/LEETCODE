class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int[][] dp = new int[nums.length][2001];
        for(int[] arr : dp) Arrays.fill(arr, Integer.MAX_VALUE);
        return helper(nums, 0, 0, target, dp);
    }
    int helper(int[] nums, int idx, int sum, int target, int[][] dp) {
        if(idx == nums.length) return (target == sum) ? 1 : 0;
        if(dp[idx][sum + 1001] != Integer.MAX_VALUE) return dp[idx][sum + 1001];
        return dp[idx][sum + 1001] = helper(nums, idx + 1, sum + nums[idx], target, dp) + helper(nums, idx + 1, sum - nums[idx], target, dp);
    }
}