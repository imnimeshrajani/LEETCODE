class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        int[] dq = new int[nums.length];
        int l = 0, r = 1;
        dq[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(dq[l] + nums[i], nums[i]);
            while (r > l && dq[r - 1] < nums[i])
                r--;

            dq[r] = nums[i];
            r++;
            if (i >= k && dq[l] == nums[i - k])
                l++;
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++)
            ans = Math.max(ans, nums[i]);

        return ans;
    }
}