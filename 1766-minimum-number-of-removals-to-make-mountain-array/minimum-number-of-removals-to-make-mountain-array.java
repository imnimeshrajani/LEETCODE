
class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length, maxi = 0;
        ;
        int[] dp1 = new int[n], dp2 = new int[n];
        ;
        Arrays.fill(dp1, 1);
        Arrays.fill(dp2, 1);

        for (int cur = 1; cur < n; cur++)
            for (int prev = 0; prev < cur; prev++)
                if (nums[prev] < nums[cur] && (1 + dp1[prev] > dp1[cur]))
                    dp1[cur] = 1 + dp1[prev];

        for (int cur = n - 1; cur >= 0; cur--)
            for (int prev = n - 1; prev > cur; prev--)
                if (nums[prev] < nums[cur] && (1 + dp2[prev] > dp2[cur]))
                    dp2[cur] = 1 + dp2[prev];

        for (int i = 0; i < n; i++)
            if (dp1[i] > 1 && dp2[i] > 1)
                maxi = Math.max(maxi, dp1[i] + dp2[i] - 1);

        return n - maxi;

    }
}