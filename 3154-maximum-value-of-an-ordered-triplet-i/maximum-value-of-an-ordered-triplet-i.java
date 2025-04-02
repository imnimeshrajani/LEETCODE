class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0, a = 0, b = 0;
        for(int val : nums) {
            ans = Math.max(ans, 1L * b * val);
            b = Math.max(b, a - val);
            a = Math.max(a, val);
        }
        return ans;
    }
}