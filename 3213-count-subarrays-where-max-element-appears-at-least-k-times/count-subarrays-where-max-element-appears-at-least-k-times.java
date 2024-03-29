class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE, count = 0;
        for (int i : nums) 
            max = Math.max(max, i);
        
        int left = 0, right = 0;
        long ans = 0;
        while (right < nums.length || left > right) {
            if (nums[right] == max) 
                count++;
            while (count >= k) {
                if (nums[left++] == max) 
                    count--;

                ans += nums.length - right;
            }
            right++;
        }
        return ans;
    }
}