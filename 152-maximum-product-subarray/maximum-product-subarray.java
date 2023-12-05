class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        int pre = nums[0], min = nums[0], result = nums[0];
    
        for (int i = 1; i < nums.length; i++) {
            int temp = pre;
            pre = Math.max(pre * nums[i], Math.max(min * nums[i], nums[i]));
            min = Math.min(temp * nums[i], Math.min(min * nums[i], nums[i]));
            result = Math.max(result, pre);
        }
        
        return result;
    }
}