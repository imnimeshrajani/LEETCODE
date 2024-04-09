class Solution {
    public boolean canJump(int[] nums) {
        for (int i = 0, min = 0; i < nums.length; i++) {
            if(i > min) return false;
            min = Math.max(nums[i] + i, min);
        }
        return true;
    }
}