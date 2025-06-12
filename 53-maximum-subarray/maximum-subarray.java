class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], sum = 0;
        for(int val : nums) {
            if(sum + val < 0) {
                maxSum = Math.max(sum + val, maxSum);
                sum = 0;
            } else {
                sum += val;
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }
}