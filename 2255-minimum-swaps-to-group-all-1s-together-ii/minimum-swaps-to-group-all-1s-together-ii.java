class Solution {
    public int minSwaps(int[] nums) {
        int k = 0;
        for (int i : nums)
            k += i;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int res = sum;
        int ans = Math.min(k - sum, k);

        for (int i = 0; i < nums.length; i++) {
            sum = sum - nums[i] + nums[(i + k) % nums.length];
            ans = Math.min(k - sum, ans);
        }

        return ans;
    }
}