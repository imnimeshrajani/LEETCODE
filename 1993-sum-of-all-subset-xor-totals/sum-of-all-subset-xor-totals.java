class Solution {
    public int subsetXORSum(int[] nums) {
        return solve(nums, 0, 0);
    }
    public int solve(int[] nums, int idx, int xor) {
        if(idx == nums.length) return xor;
        return solve(nums, idx+1, xor ^ nums[idx]) + solve(nums, idx+1, xor);
    }
}