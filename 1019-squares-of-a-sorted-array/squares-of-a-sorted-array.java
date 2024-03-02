class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        int result[] = new int[nums.length];
        while (left <= right) {
            result[index] = (Math.abs(nums[left]) > Math.abs(nums[right])) ? nums[left] * nums[left++] : nums[right] * nums[right--];
            
            index--;
        }
        return result;
    }
}