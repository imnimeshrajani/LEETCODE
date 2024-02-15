class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long[] temp = new long[nums.length];
        temp[0] = nums[0];
        long ans = -1;
        for (int i = 1; i < nums.length; i++) {
            temp[i] = nums[i] + temp[i-1];
            if(i >= 2 && nums[i] < temp[i-1])
                ans = Math.max(ans, temp[i]);
        }
        return ans;

    }
}