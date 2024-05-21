class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0, n = nums.length;
        for(int i : nums) sum += i;
        if(sum % 2 == 1) return false;
        sum /= 2;
        Boolean[][] dp = new Boolean[n + 1][sum + 1];
        return helper(nums, 0, sum, dp);
    }
    // void solve(int[] nums, int idx, List<Integer> list, int sum) {
    //     if(idx == nums.length) {
    //         for(int i : list) sum -= i;
    //         // return sum == 0;
    //     }
    //     boolean a = solve(nums, idx + 1, list);
    //     list.add(nums[idx]);
    //     boolean b = solve(nums, idx + 1, list);
    //     list.remove(list.size() - 1);
    //     return ;
    // }
    boolean helper(int[] nums, int i, int sum, Boolean[][] dp) {
        
        if(sum == 0) return true;
        else if(i >= nums.length || sum < 0) return false;
        if(dp[i][sum] != null) return dp[i][sum];
        return dp[i][sum] = helper(nums, i + 1, sum - nums[i], dp) || helper(nums, i + 1, sum, dp);
    }
    // boolean helper(int[] nums, int n, int sum, boolean[][] dp) {
    //     if(n < 0 || sum < 0) return false;
    //     if(dp[n][sum]) return true;
    //     if(nums[n] == sum || sum == 0) return true;

    //     if(sum < nums[n]) return helper(nums, n - 1, sum, dp);
    
    //     return dp[n][sum] = helper(nums, n - 1, sum - nums[n], dp) || helper(nums, n - 1, sum, dp);
    // }
}