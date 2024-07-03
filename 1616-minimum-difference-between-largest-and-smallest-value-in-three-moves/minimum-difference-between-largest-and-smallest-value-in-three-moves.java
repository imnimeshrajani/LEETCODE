class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;
        if(n < 5) return 0;
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        ans = Math.min(ans, Math.abs(nums[3] - nums[n - 1]));
        ans = Math.min(ans, Math.abs(nums[2] - nums[n - 2]));
        ans = Math.min(ans, Math.abs(nums[1] - nums[n - 3]));
        ans = Math.min(ans, Math.abs(nums[0] - nums[n - 4]));
        return ans;

    }
}