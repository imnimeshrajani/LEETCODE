class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length <= 1) return;
        int start = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[start] == 0 && nums[i] != 0) {
                nums[start] = nums[start] + nums[i];
                nums[i] = nums[start] - nums[i];
                nums[start] = nums[start] - nums[i];
                start++;
            } else if (nums[start] == 0 && nums[i] == 0) {
            } else {
                start++;
            }
        }
    }
}