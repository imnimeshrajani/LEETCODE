class Solution {
    public int minPatches(int[] nums, int n) {
        int count = 0, i = 0;
        long value = 1;
        while(value <= n) {
            if(i < nums.length && nums[i] <= value) value += nums[i++];
            else {
                value += value;
                count++;
            }
        }
        return count;
    }
}