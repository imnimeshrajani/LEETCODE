class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length - 1, left = 0, right = n, idx = n, ans[] = new int[n + 1];
        while(left<=right) {
            ans[idx--] = Math.abs(nums[left]) > Math.abs(nums[right]) ? nums[left] * nums[left++] : nums[right] * nums[right--];
        }
        return ans;
    }
}