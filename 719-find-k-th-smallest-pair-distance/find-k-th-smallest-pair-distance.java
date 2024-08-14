class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int low = 0, high = nums[nums.length - 1] - nums[0];
        while(low < high) {
            int mid = low + (high - low) / 2;
            if (helper(nums, mid) < k) low = mid + 1;
            else high = mid;
        }
        return low;
    }
    int helper(int[] nums, int size) {
        int count = 0, j = 0;
        for(int i = 0; i < nums.length; i++) {
            while(j < nums.length && nums[j] - nums[i] <= size) j++;
            count += j - i - 1;
        }
        return count;
    }
}