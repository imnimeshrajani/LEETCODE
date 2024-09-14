class Solution {
    public int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE, ans = 1, count = 0;
        for(int val : nums) max = Math.max(max, val);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == max) {
                while(i < nums.length && nums[i++] == max) count++;
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        return ans;
    }
}