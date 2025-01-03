class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length, cnt = 0;
        long sumTotal = 0, sumCurr = 0;

        for (int i = 0; i < n; i++) {
            sumTotal += nums[i];
        }

        for (int i = 0; i < n - 1; i++) {
            sumCurr += nums[i];
            if (sumCurr >= sumTotal - sumCurr) {
                cnt++;
            }
        }

        return cnt;
    }
}