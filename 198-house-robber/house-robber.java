class Solution {
    public int rob(int[] nums) {
        int ans1 = 0, ans2 = 0;
        for(int i : nums) {
            int val = ans2 + i;
            ans2 = Math.max(ans1, ans2);
            ans1 = val;
        }
        return Math.max(ans1, ans2);
    }
}