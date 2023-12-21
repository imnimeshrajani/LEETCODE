class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1, count = 0;
        for(int i : nums) if(i==0) count++;
        if(count > 1) return new int[nums.length];
        for(int i : nums) if(i != 0) product *= i;
        if(count == 1) {
            for(int i = 0; i < nums.length; i++) if (nums[i]==0) nums[i] = product; else nums[i] = 0;
        } else {
            for(int i = 0; i < nums.length; i++) nums[i] = product/nums[i];
        }
        return nums;
    }
}