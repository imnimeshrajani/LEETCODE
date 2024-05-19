class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        int n = nums.length, xorArray[] = new int[n];;
        if(n == 1) return nums[0];

        for(int i = 0; i < n; i++)
            xorArray[i] = (nums[i] ^ k);

        long option = xorArray[0], ans = nums[0];
        for(int i = 1; i < n; i++) {
            long tempOption = Math.max(option + nums[i], ans + xorArray[i]);
            long tempAns = Math.max(ans + nums[i], option + xorArray[i]);
            option = tempOption;
            ans = tempAns;
        }
        return ans;
    }
}