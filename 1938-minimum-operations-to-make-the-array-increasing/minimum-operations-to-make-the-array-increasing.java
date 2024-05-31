class Solution {
    public int minOperations(int[] nums) {
        if(nums.length  == 1) return 0;
        int num = nums[0], ans = 0;
        for(int i = 1; i < nums.length; i++) {
            if(num == nums[i]) {
                ans++;
                num++;
            } else if(num > nums[i]) {
                num++;
                ans += num - nums[i];
            } else num = nums[i];
        }
        return ans;
    }
}