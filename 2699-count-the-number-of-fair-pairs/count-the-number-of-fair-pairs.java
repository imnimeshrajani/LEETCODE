class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return helper(nums, upper) - helper(nums, lower - 1);
    }

    long helper(int[] nums, int sum) {
        long ans = 0;
        int start = 0, end = nums.length - 1;
            while(start < end) {
                if(nums[start] + nums[end] <= sum) {
                    ans += end - start;
                    start++;
                } else end--;
            }
        return ans;
    }
}