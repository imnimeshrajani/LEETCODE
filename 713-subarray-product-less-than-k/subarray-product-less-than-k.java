class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       int l = 0, r = 0, ans = 0, prod = 1;
        while (r < nums.length) {
            prod *= nums[r];
            while (prod >= k && l <= r) 
                prod /= nums[l++];

            ans += r++ - l + 1;
        }
        return ans;
    }
}