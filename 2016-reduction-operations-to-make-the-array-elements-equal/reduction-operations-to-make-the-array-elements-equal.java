class Solution {
    public int reductionOperations(int[] nums) {
        int unique = 0, n = nums.length;
        if(n == 1) return 0;
        Arrays.sort(nums);
        for(int i = 0; i < n - 1; i++) if(nums[i]!=nums[i+1]) unique++;
        unique++;
        int count = 1, ans = 0;
        for(int i = n-1; i > 0 ; i--) {
            if(nums[i]==nums[i-1]) count++;
            else {
                ans += --unique * count;
                count = 1;
            }
        }
        return ans;
    }
}