class Solution {
    public int missingNumber(int[] nums) {
       int ans, i = 0, j = i + 1;
        while (j < nums.length) {
            if (nums[i] > nums[j]) {
                nums[i] ^= nums[j];
                nums[j] ^= nums[i];
                nums[i] ^= nums[j];
            }
            j++;
            if (j == nums.length) j = i++ + 1;
        }
        ans = nums[nums.length-1];
        if (nums[0]!=0) return nums[0]-1;
        for (int k = 0; k < nums.length - 1; k++) 
            if (nums[k + 1] - nums[k] != 1) return nums[k] + 1;
        
        return (nums.length == 2) ? nums[nums.length-1]+1 : ans+1;
    }
}