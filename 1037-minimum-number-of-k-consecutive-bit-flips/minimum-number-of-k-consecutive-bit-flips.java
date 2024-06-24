class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length, changed = 0, ans = 0, arr[] = new int[n];
        for(int i = 0; i < nums.length; i++) {
            if(i >= k) changed ^= arr[i - k];
            if(changed == nums[i]) {
                if(i + k > n) return -1;
                arr[i] = 1;
                changed ^= 1;
                ans++;
            }
        }
        return ans;
    }
}