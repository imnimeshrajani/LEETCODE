class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1, count = 0;
        for (int i : nums)
            if (i == 0)
                count++;
        if (count > 1)
            return new int[nums.length];
        for (int i : nums)
            if (i != 0)
                product *= i;

        for (int i = 0; i < nums.length; i++) {
            if (count == 1)
                nums[i] = nums[i] == 0 ? product : 0;
            else
                nums[i] = product / nums[i];
        }
        return nums;
    }
}