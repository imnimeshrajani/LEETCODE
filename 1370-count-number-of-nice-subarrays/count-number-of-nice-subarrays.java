class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int start = 0, end = 0, prev = 0, count = 0, temp = 0, ans = 0;
        while (end < nums.length) {
            if(nums[end] % 2 == 1) {
                count++;
                temp = 0;
            }
            while(count == k) {
                temp++;
                if(nums[start] % 2 == 1) count--;
                start++;
            }
            ans += temp;
            end++;
        }
        return ans;
    }
}