class Solution {
    public int numTeams(int[] rating) {
        return helper(rating, 0, true, -1, 0, new Integer[rating.length][rating.length][4]) + helper(rating, 0, false, -1, 0, new Integer[rating.length][rating.length][4]);
    }
    int helper(int[] arr, int count, boolean flag, int prev, int idx, Integer[][][] dp) {
        if(count == 3) return 1;
        if(idx == arr.length) return 0;
        if(dp[idx][prev + 1][count] != null) return dp[idx][prev + 1][count];
        int notTaken = helper(arr, count, flag, prev, idx + 1, dp), taken = 0;
        if(flag) {
            if(prev == -1 || arr[idx] > arr[prev]) 
                taken = helper(arr, count + 1, flag, idx, idx + 1, dp);
        } else {
            if(prev == -1 || arr[idx] < arr[prev]) {
                taken = helper(arr, count + 1, flag, idx, idx + 1, dp);
            }
        }
        return dp[idx][prev + 1][count] = taken + notTaken;
    }
}