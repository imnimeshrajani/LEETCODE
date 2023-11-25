class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int right = 0, left = 0;
        for (int i : nums) right += i;
        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            right -= temp;
            nums[i] = temp * i - left + right - temp * (nums.length - i - 1);
            left += temp;
        }
        return nums;
    }
}