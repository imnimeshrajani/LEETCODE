class Solution {
    public int firstMissingPositive(int[] nums) {
        int ans = 0, i = 0;
        while(i < nums.length) {
            int j = nums[i] - 1;
            if(nums[i] <= nums.length && nums[i] > 0 && nums[i] != nums[j]) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            } else i++;
                
        }
        for(i = 0; i < nums.length; i++) {
            if(nums[i] != i+1) return i+1;
        }
        return nums.length + 1 ;
    }
}