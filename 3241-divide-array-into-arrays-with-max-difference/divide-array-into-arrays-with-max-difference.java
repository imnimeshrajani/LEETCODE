class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length, groupIndex = 0;
        int[][] ans = new int[nums.length / 3][3];
        int row = 0;
        for (int i = 0; i < n; i += 3) {
            if ((i + 2) < n && (nums[i + 2] - nums[i]) <= k) {
                ans[row][0] = nums[i];
                ans[row][1] = nums[i+1];
                ans[row++][2] = nums[i+2];
                groupIndex++;
            } else {
                return new int[0][0];
            }
        }
        return ans;
    }
}