class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int  ans = 0;
        int l = 0, r = 1;
        int n = nums.length;
        if (n == 1) return (nums[0]<=threshold && nums[0]%2==0) ? 1 : 0;
        while (l < n && r < n) {
            if (nums[l] % 2 != 0 || nums[l] > threshold) {
                l = r;
                r = l+1;
            } else {
                if (nums[r] <= threshold && nums[r] % 2 != nums[r - 1] % 2) {
                    ans = Math.max(ans, (r-l)+1);
                    r++;
                } else {
                     ans = Math.max(ans, 1);
                    l = r;
                    r = l+1;
                }
            }
        }
        if(l == nums.length-1 && nums[l] %2==0 && nums[l] <= threshold){
                ans = Math.max(ans, 1);
        }
        return ans;
    }
}