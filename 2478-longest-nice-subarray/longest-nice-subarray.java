class Solution {
    public int longestNiceSubarray(int[] nums) {
        int j = 0, res = 0, max = 1;
        for(int i = 0; i < nums.length;) {
            if((res & nums[i]) == 0) {
                res ^= nums[i];
                max = Math.max(max, i - j + 1);
                i++;

            } else {
                res ^= nums[j];
                j++;
            }
        }
        return max;
    }
}