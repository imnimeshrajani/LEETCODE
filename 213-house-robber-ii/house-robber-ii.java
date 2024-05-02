class Solution {
    int[][] dp;
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        dp = new int[nums.length + 1][2];
        for(int[] i : dp) Arrays.fill(i,-1);
        return Math.max(helper(nums, 0, nums.length - 2, 0), helper(nums, 1, nums.length - 1, 1));
    }
    int helper(int[] nums, int start, int end, int index) {
        if(end < start) return 0;
        else if(end == start) return nums[start];
        else if(dp[end][index] != -1) return dp[end][index];
        return dp[end][index] = Math.max(helper(nums, start, end - 1, index), helper(nums,start, end - 2, index) + nums[end]);
    }
}