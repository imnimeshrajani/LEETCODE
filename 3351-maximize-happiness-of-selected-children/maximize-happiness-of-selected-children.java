class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans = 0;
        int n = happiness.length - 1, idx = n;
        Arrays.sort(happiness);
        while(k-- > 0) {
            int val = (n - idx);
            ans += happiness[idx--] - val > 0 ? happiness[idx + 1] - val : 0;
        }
        return ans;
    }
}